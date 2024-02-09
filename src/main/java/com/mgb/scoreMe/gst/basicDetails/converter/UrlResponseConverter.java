package com.mgb.scoreMe.gst.basicDetails.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.gst.basicDetails.model.RefIdResponse;
import com.mgb.scoreMe.gst.basicDetails.model.UrlResponse;

public class UrlResponseConverter {

    public static UrlResponse convertJsonToUrlResponse(String responseString){
        UrlResponse response = null;
        try{
            Gson gson = new Gson();
            response = gson.fromJson(responseString, UrlResponse.class);

        }catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }
    }

