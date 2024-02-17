package com.mgb.scoreMe.gst.basicDetails.fileDownload.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.gst.basicDetails.fileDownload.model.JsonResponse;
import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANResponse;

public class JsonResponseConverter {
    public static JsonResponse convertJsonTOJsonResponse(String responseString){
        JsonResponse response = null;
        try{
            System.out.println("responseString "+responseString);
            Gson gson = new Gson();
            response = gson.fromJson(responseString, JsonResponse.class);
            System.out.println("response1 "+response);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("response2 "+response);
        return response;
    }
}
