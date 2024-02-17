package com.mgb.scoreMe.itr.url.service;

import com.mgb.scoreMe.config.Config;
import com.mgb.scoreMe.gst.basicDetails.converter.UrlResponseConverter;
import com.mgb.scoreMe.gst.basicDetails.model.UrlResponse;
import com.mgb.scoreMe.itr.url.converter.ResponseConverter;
import com.mgb.scoreMe.itr.url.model.ItrUrlResponse;
import com.mgb.scoreMe.itr.url.repo.ItrUrlResponseRepo;
import com.mgb.scoreMe.util.RequestFormatter;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ItrUrlGenService {
    @Autowired
    ItrUrlResponseRepo responseRepo;

    public ItrUrlResponse getItrUrlByRefId(String referenceId){

        System.out.println("inside get ITR URL By REF ID FromApi service "+referenceId);
        // requestRepo.save(gstinByPANRequest);
        ItrUrlResponse urlResponse=null;
        String apiUrl = Config.itrUrl+"/itr/external/getItrRequestData?referenceId="+referenceId;
        MediaType mediaType = MediaType.parse("text/plain");
//        OkHttpClient client = getOkHttpClientWithP12(p12FilePath, p12Password);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        System.out.println("client prepared");
        // String requestStr= PANConverter.convertPANRequestToJson(PANRequestConverter.convertPANRequestForAPI(panRequest));
//        String requestStr= RequestConverter.convertGSTINByPANAPIRequestToJSON(RequestConverter.convertGSTINByPANARequesttoAPIRequest(gstinByPANRequest));
//        System.out.println("requestStr "+requestStr);
        RequestBody body = RequestBody.create( mediaType,"")     ;
//        Request request = new Request.Builder().url(apiUrl).method("GET",null)
//                .addHeader("ClientId", "f511d74fa95fa75f35c5885e3be68563").addHeader("ClientSecret", "b8a67b8b4010612064a2c1da5b10626a693cfb8e6d79dd77c8768732831b4725")
//                .build();
        Request request = RequestFormatter.formatGetRequest(apiUrl,body);

        System.out.println("request build");
        try (Response response = client.newCall(request).execute()) {
            System.out.println("request executed");
            if (response.isSuccessful()) {
                System.out.println("response successful");
                System.out.println(response);
                ResponseBody responseBody=response.body();
                //System.out.println("responseBody.toString() "+responseBody.source().readUtf8());
                urlResponse= ResponseConverter.convertToItrUrlResponse(responseBody.source().readUtf8());

                //System.out.println("panStatus "+gstinByPANResponse.getData());
                responseRepo.save(urlResponse);
//                c= StringToJsonConverter.convertStringToCibilResponse(responseBody.source().readUtf8());
//                if(response.header("success").equalsIgnoreCase("true")){
//                    c= StringToJsonConverter.convertStringToCibilResponse(responseBody.source().readUtf8());
//                }
//                repo.save(StringToJsonConverter.convertStringToCibilResponse(responseBody.source().readUtf8()));

            } else {
                // System.out.println("Request failed. Response Headers: " +response.headers());

                System.out.println("Request failed. Response code: "+ response.code());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return urlResponse;
    }
}
