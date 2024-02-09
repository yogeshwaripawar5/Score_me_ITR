package com.mgb.scoreMe.gst.basicDetails.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.gst.basicDetails.model.RefIdResponse;
import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANResponse;

public class RefIdResponseConverter {

    public static RefIdResponse convertJsonToRefIdResponse(String responseString){
        RefIdResponse response = null;
        try{
            Gson gson = new Gson();
            response = gson.fromJson(responseString, RefIdResponse.class);

        }catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }
    }

