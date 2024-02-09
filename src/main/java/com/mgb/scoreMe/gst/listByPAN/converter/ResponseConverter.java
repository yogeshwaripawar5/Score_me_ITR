package com.mgb.scoreMe.gst.listByPAN.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANResponse;
import org.springframework.stereotype.Service;

@Service
public class ResponseConverter {

    public static GSTINByPANResponse convertJsonTOGSTINByPANResponse(String responseString){
        GSTINByPANResponse response = null;
        try{
            Gson gson = new Gson();
            response = gson.fromJson(responseString, GSTINByPANResponse.class);

        }catch(Exception e){
            e.printStackTrace();
        }
        return response;
    }
}
