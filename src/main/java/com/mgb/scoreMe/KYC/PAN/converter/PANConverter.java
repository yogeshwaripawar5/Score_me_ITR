package com.mgb.scoreMe.KYC.PAN.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.KYC.PAN.model.PANDetailResponse;
import com.mgb.scoreMe.KYC.PAN.model.PANRequestAPI;
import com.mgb.scoreMe.KYC.PAN.model.PANVerificationResponse;
import org.springframework.stereotype.Service;

@Service
public class PANConverter {

    public static  String convertPANRequestToJson(PANRequestAPI panRequest){
        String jsonStr=new Gson().toJson(panRequest);
        return jsonStr;
    }

public static  PANVerificationResponse convertJsonTOPANRespnse(String responseString){
    PANVerificationResponse panVerificationResponse = null;
    try{
        Gson gson = new Gson();
        panVerificationResponse = gson.fromJson(responseString, PANVerificationResponse.class);

    }catch(Exception e){
        e.printStackTrace();
    }
    return panVerificationResponse;
}

    public static PANDetailResponse convertJsonTOPANDetailResponse(String responseString){
        PANDetailResponse panDetailResponse = null;
        try{
            Gson gson = new Gson();
            panDetailResponse = gson.fromJson(responseString, PANDetailResponse.class);

        }catch(Exception e){
            e.printStackTrace();
        }
        return panDetailResponse;
    }
}
