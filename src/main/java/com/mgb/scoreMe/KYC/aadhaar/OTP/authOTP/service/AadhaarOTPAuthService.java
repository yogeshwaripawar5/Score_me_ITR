package com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.service;

import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthRequest;
import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthResponse;
import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.repo.AadhaarOTPAuthRequestRepo;
import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.repo.AadhaarOTPAuthResponseRepo;
import com.mgb.scoreMe.KYC.aadhaar.converter.AadhaarConverter;
import com.mgb.scoreMe.config.Config;
import com.mgb.scoreMe.util.RequestFormatter;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AadhaarOTPAuthService {
    @Autowired
    AadhaarOTPAuthRequestRepo requestRepo;
    @Autowired
    AadhaarOTPAuthResponseRepo responseRepo;

    public AadhaarOTPAuthResponse getAadhaarOTPResult(AadhaarOTPAuthRequest otpRequest){

        System.out.println("inside auth OTP service");
        requestRepo.save(otpRequest);
        AadhaarOTPAuthResponse aadhaarOTPAuthResponse=null;
        String apiUrl = Config.kycUrl+"/kyc/external/aadhaarDetail";
        MediaType mediaType = MediaType.parse("application/json");
//        OkHttpClient client = getOkHttpClientWithP12(p12FilePath, p12Password);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        System.out.println("client prepared");
//    String requestStr= PANConverter.convertPANRequestToJson(PANRequestConverter.convertPANRequestForAPI(panRequest));
        String requestStr= AadhaarConverter.convertAadharOTPAuthRequestToJson(AadhaarConverter.convertAadharOTPAuthRequestForAPI(otpRequest));
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
                aadhaarOTPAuthResponse=AadhaarConverter.convertJsonToAadhaarOTPAuthResponse(responseBody.source().readUtf8());
                System.out.println("aadhaarOTPAuthResponse "+aadhaarOTPAuthResponse);
                responseRepo.save(aadhaarOTPAuthResponse);
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
        return aadhaarOTPAuthResponse;
    }



}
