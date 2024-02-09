package com.mgb.scoreMe.gst.listByPAN.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANAPIRequest;
import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANRequest;
import org.springframework.stereotype.Service;

@Service
public class RequestConverter {

    public static GSTINByPANAPIRequest convertGSTINByPANARequesttoAPIRequest(GSTINByPANRequest  gstinByPANRequest){
        return new GSTINByPANAPIRequest(gstinByPANRequest.getPan());
    }

    public static String convertGSTINByPANAPIRequestToJSON(GSTINByPANAPIRequest panapiRequest){
        return new Gson().toJson(panapiRequest);
    }



}
