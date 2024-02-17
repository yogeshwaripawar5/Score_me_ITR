package com.mgb.scoreMe.gst.basicDetails.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.gst.basicDetails.model.RefIdResponse;
import com.mgb.scoreMe.gst.basicDetails.model.UrlResponse;

public class UrlResponseConverter {

    public static UrlResponse convertJsonToUrlResponse(String responseString){
        UrlResponse response = null;
        try{
            System.out.println("responseString "+responseString);
            Gson gson = new Gson();
            response = gson.fromJson(responseString, UrlResponse.class);
            System.out.println("response1 "+response);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("response2 "+response);
        return response;
    }
    }

