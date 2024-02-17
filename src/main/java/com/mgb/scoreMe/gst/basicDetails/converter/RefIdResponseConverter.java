package com.mgb.scoreMe.gst.basicDetails.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.gst.basicDetails.model.RefIdResponse;
import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANResponse;

public class RefIdResponseConverter {

    public static RefIdResponse convertJsonToRefIdResponse(String responseString){
        RefIdResponse response = null;
        try{
            System.out.println("responseString "+responseString);
            Gson gson = new Gson();
            response = gson.fromJson(responseString, RefIdResponse.class);
            System.out.println(" response 1"+response);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(" response 2"+response);
        return response;
    }
    }

