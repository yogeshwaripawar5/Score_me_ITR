package com.mgb.scoreMe.util;

import com.mgb.scoreMe.config.Config;
import okhttp3.Request;
import okhttp3.RequestBody;

public class RequestFormatter {

    public static Request formatPostRequest(String apiUrl, RequestBody body){
        Request request = new Request.Builder().url(apiUrl).post(body).
                addHeader("ClientId", Config.clientId).addHeader("ClientSecret", Config.ClientSecret)
                .build();
        return request;
    }



    public static Request formatGetRequest(String apiUrl, RequestBody body){
                Request request = new Request.Builder().url(apiUrl).method("GET",null)
                .addHeader("ClientId", "f511d74fa95fa75f35c5885e3be68563").addHeader("ClientSecret", "b8a67b8b4010612064a2c1da5b10626a693cfb8e6d79dd77c8768732831b4725")
                .build();
        return request;
    }
}
