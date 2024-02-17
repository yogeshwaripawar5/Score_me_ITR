package com.mgb.scoreMe.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonPOC {

    public static void main(String[] args){
        System.out.println("inside main");


        String json = "{\"first /name\":\"Baeldung Baeldung\",\"java\":true}";
json=json.replaceAll(" ","_");
        System.out.println("json "+json);
        JsonObject jsonObject = JsonParser.parseString(json)
                .getAsJsonObject();

        System.out.println("name "+jsonObject.get("first_/name")
                .getAsString());
    }
}
