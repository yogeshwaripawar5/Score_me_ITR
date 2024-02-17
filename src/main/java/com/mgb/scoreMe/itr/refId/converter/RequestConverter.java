package com.mgb.scoreMe.itr.refId.converter;

import com.google.gson.Gson;
import com.mgb.scoreMe.itr.refId.model.ItrEmail;
import com.mgb.scoreMe.itr.refId.model.ItrEmailRequest;

public class RequestConverter {
    public static String convertToJson(ItrEmailRequest emailRequest){
        System.out.println("request converter "+emailRequest.getEmail());
        return new Gson().toJson(new ItrEmail(emailRequest.getEmail(), emailRequest.getNotificationEmail()));
    }
}
