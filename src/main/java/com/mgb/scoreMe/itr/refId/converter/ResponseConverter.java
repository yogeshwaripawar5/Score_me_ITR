package com.mgb.scoreMe.itr.refId.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.itr.refId.model.ItrEmailResponse;

public class ResponseConverter {
    public static ItrEmailResponse convertToItrEmailResponse(String responseString){
        ItrEmailResponse response = null;
        try{
            Gson gson = new Gson();
            response = gson.fromJson(responseString, ItrEmailResponse.class);

        }catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }
}
