package com.mgb.scoreMe.KYC.aadhaar.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthAPIRequest;
import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthRequest;
import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthResponse;
import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadhaarOTPResponse;
import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadharOTPRequest;
import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadharOTPRequestAPI;
import org.springframework.stereotype.Service;

@Service
public class AadhaarConverter {
    public static AadharOTPRequestAPI convertAadharOTPRequestForAPI(AadharOTPRequest otpRequest){
        return new AadharOTPRequestAPI(otpRequest.getAadhaar_number());
    }

    public static  String convertAadharOTPRequestToJson(AadharOTPRequestAPI aadharOTPRequestAPI){
        String jsonStr=new Gson().toJson(aadharOTPRequestAPI);
        return jsonStr;
    }

    public static AadhaarOTPResponse convertJsonToAadhaarOTPResponse(String responseString){
        AadhaarOTPResponse aadhaarOTPResponse = null;
        try{
            Gson gson = new Gson();
            aadhaarOTPResponse = gson.fromJson(responseString, AadhaarOTPResponse.class);

        }catch(Exception e){
            e.printStackTrace();
        }
        return aadhaarOTPResponse;
    }





    public static AadhaarOTPAuthAPIRequest convertAadharOTPAuthRequestForAPI(AadhaarOTPAuthRequest otpAuthRequest){
        return new AadhaarOTPAuthAPIRequest(otpAuthRequest.getOtp(),otpAuthRequest.getAadhaar_number());
    }

    public static  String convertAadharOTPAuthRequestToJson(AadhaarOTPAuthAPIRequest aadharOTPAuthRequestAPI){
        String jsonStr=new Gson().toJson(aadharOTPAuthRequestAPI);
        return jsonStr;
    }

    public static AadhaarOTPAuthResponse convertJsonToAadhaarOTPAuthResponse(String responseString){
        AadhaarOTPAuthResponse aadhaarOTPAuthResponse = null;
        try{
            Gson gson = new Gson();
            aadhaarOTPAuthResponse = gson.fromJson(responseString, AadhaarOTPAuthResponse.class);

        }catch(Exception e){
            e.printStackTrace();
        }
        return aadhaarOTPAuthResponse;
    }

}
