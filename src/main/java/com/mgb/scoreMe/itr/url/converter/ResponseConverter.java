package com.mgb.scoreMe.itr.url.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.itr.refId.model.ItrEmailResponse;
import com.mgb.scoreMe.itr.url.model.ItrUrlResponse;

public class ResponseConverter {

    public static ItrUrlResponse convertToItrUrlResponse(String responseString){

        ItrUrlResponse response = null;
        try{
            System.out.println("responseString "+responseString);
            Gson gson = new Gson();
            response = gson.fromJson(responseString, ItrUrlResponse.class);

        }catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }
}
