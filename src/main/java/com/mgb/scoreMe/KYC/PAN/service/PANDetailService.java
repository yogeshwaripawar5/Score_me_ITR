package com.mgb.scoreMe.KYC.PAN.service;

import com.mgb.scoreMe.KYC.PAN.converter.PANConverter;
import com.mgb.scoreMe.KYC.PAN.converter.PANRequestConverter;
import com.mgb.scoreMe.KYC.PAN.model.PANDetailResponse;
import com.mgb.scoreMe.KYC.PAN.model.PANRequest;
import com.mgb.scoreMe.KYC.PAN.repo.PANDetailResponseRepo;
import com.mgb.scoreMe.KYC.PAN.repo.PANRequestRepo;
import com.mgb.scoreMe.config.Config;
import com.mgb.scoreMe.util.RequestFormatter;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PANDetailService {
    @Autowired
    PANDetailResponseRepo responseRepo;
    @Autowired
    PANRequestRepo panRequestRepo;

    public PANDetailResponse getPANDetailsFromAPI(PANRequest panRequest)  {
        System.out.println("inside PAN Details service");
        panRequestRepo.save(panRequest);
        PANDetailResponse panStatus=null;
        String apiUrl = Config.kycUrl+"/kyc/external/panDetailInfo";
        MediaType mediaType = MediaType.parse("application/json");
//        OkHttpClient client = getOkHttpClientWithP12(p12FilePath, p12Password);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        System.out.println("client prepared");
        String requestStr= PANConverter.convertPANRequestToJson(PANRequestConverter.convertPANRequestForAPI(panRequest));
        System.out.println("requestStr "+requestStr);
        RequestBody body = RequestBody.create(requestStr, mediaType)     ;
//        Request request = new Request.Builder().url(apiUrl).post(body).
//                addHeader("ClientId", "f511d74fa95fa75f35c5885e3be68563").addHeader("ClientSecret", "b8a67b8b4010612064a2c1da5b10626a693cfb8e6d79dd77c8768732831b4725")
//                .build();
        Request request = RequestFormatter.formatPostRequest(apiUrl,body);

        System.out.println("request build");
        try (Response response = client.newCall(request).execute()) {
            System.out.println("request executed");
            if (response.isSuccessful()) {
                System.out.println("response successful");
                System.out.println(response);
                ResponseBody responseBody=response.body();
                System.out.println("responseBody "+responseBody);
                panStatus=PANConverter.convertJsonTOPANDetailResponse(responseBody.source().readUtf8());
                System.out.println("panStatus "+panStatus.getData());
                responseRepo.save(panStatus);
//                c= StringToJsonConverter.convertStringToCibilResponse(responseBody.source().readUtf8());
//                if(response.header("success").equalsIgnoreCase("true")){
//                    c= StringToJsonConverter.convertStringToCibilResponse(responseBody.source().readUtf8());
//                }
//                repo.save(StringToJsonConverter.convertStringToCibilResponse(responseBody.source().readUtf8()));

            } else {
                System.out.println("Request failed. Response Headers: " +response.headers());

                System.out.println("Request failed. Response code: "+ response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
return panStatus;
    }




//    private OkHttpClient getOkHttpClientWithP12(String p12FilePath, String p12Password) {
//        // Load the P12 file
//        KeyStore keyStore = loadP12KeyStore(p12FilePath, p12Password);
//
//        // Create a custom TrustManager that uses the loaded KeyStore
//        TrustManagerFactory trustManagerFactory;
//        try {
//            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
//            trustManagerFactory.init((KeyStore) null);
//        } catch (NoSuchAlgorithmException | KeyStoreException e) {
//            throw new RuntimeException("Error initializing TrustManagerFactory", e);
//        }
//
//        // Create an OkHttpClient with custom TrustManager and KeyManager
//        return new OkHttpClient.Builder()
//                .sslSocketFactory(getSSLSocketFactory(keyStore, p12Password), (X509TrustManager) trustManagerFactory.getTrustManagers()[0])
//                .build();
//    }
//
//    private  KeyStore loadP12KeyStore(String p12FilePath, String p12Password) {
//        try (InputStream inputStream = Files.newInputStream(Paths.get(p12FilePath))) {
//            KeyStore keyStore = KeyStore.getInstance("PKCS12");
//            keyStore.load(inputStream, p12Password.toCharArray());
//            return keyStore;
//        } catch (IOException | NoSuchAlgorithmException | CertificateException | KeyStoreException e) {
//            throw new RuntimeException("Error loading P12 KeyStore", e);
//        }
//    }
//
//    private SSLSocketFactory getSSLSocketFactory(KeyStore keyStore, String p12Password) {
//        try {
//            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
//            keyManagerFactory.init(keyStore, p12Password.toCharArray());
//
//            SSLContext sslContext = SSLContext.getInstance("TLS");
//            sslContext.init(keyManagerFactory.getKeyManagers(), null, new SecureRandom());
//            return sslContext.getSocketFactory();
//        } catch (NoSuchAlgorithmException | KeyStoreException | UnrecoverableKeyException | KeyManagementException e) {
//            throw new RuntimeException("Error creating SSLSocketFactory", e);
//        }
//    }




}
