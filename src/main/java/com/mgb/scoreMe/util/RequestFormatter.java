package com.mgb.scoreMe.util;

import com.mgb.scoreMe.config.Config;
import okhttp3.Request;
import okhttp3.RequestBody;

public class RequestFormatter {

    public static Request formatRequest(String apiUrl, RequestBody body){
        Request request = new Request.Builder().url(apiUrl).post(body).
                addHeader("ClientId", Config.clientId).addHeader("ClientSecret", Config.ClientSecret)
                .build();
        return request;
    }
}
