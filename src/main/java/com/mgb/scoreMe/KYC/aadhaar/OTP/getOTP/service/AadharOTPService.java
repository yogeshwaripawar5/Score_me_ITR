package com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.service;

import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadharOTPRequest;
import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.repo.AadharOTPRequestRepo;
import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadhaarOTPResponse;
import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.repo.AadhaarOTPResponseRepo;
import com.mgb.scoreMe.KYC.aadhaar.converter.AadhaarConverter;
import com.mgb.scoreMe.config.Config;
import com.mgb.scoreMe.util.RequestFormatter;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AadharOTPService {
@Autowired
AadharOTPRequestRepo otpRequestRepo;
@Autowired
    AadhaarOTPResponseRepo otpResponseRepo;
public AadhaarOTPResponse getAadhaarOTP(AadharOTPRequest otpRequest){

    System.out.println("inside get OTP service");
    otpRequestRepo.save(otpRequest);
    AadhaarOTPResponse aadhaarOTPResponse=null;
    String apiUrl = Config.kycUrl+"/kyc/external/aadhaarOtp";
    MediaType mediaType = MediaType.parse("application/json");
//        OkHttpClient client = getOkHttpClientWithP12(p12FilePath, p12Password);
    OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
    System.out.println("client prepared");
//    String requestStr= PANConverter.convertPANRequestToJson(PANRequestConverter.convertPANRequestForAPI(panRequest));
    String requestStr= AadhaarConverter.convertAadharOTPRequestToJson(AadhaarConverter.convertAadharOTPRequestForAPI(otpRequest));
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
            aadhaarOTPResponse=AadhaarConverter.convertJsonToAadhaarOTPResponse(responseBody.source().readUtf8());
            System.out.println("aadhaarOTPResponse "+aadhaarOTPResponse);
            otpResponseRepo.save(aadhaarOTPResponse);
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
    return aadhaarOTPResponse;
}
}
