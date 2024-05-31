package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.OtherFirmPartner;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class OtherFirmPartnerConverter {
    public static List<OtherFirmPartner> convertToOtherFirmPartnerList(JsonObject otherFirmsPartnerJson){
        System.out.println("INSIDE convertToOtherFirmPartnerList");

        List<OtherFirmPartner> otherFirmPartnerList= new ArrayList<>();
        JsonArray dataArray = otherFirmsPartnerJson.getAsJsonArray();

        for (JsonElement singleData : dataArray) {

            JsonObject dataAsJsonObject = singleData.getAsJsonObject();

            OtherFirmPartner singleEntity = new OtherFirmPartner();
            singleEntity.setName(dataAsJsonObject.get("Name").getAsString());
            singleEntity.setPan(dataAsJsonObject.get("PAN").getAsString());
            singleEntity.setYear(dataAsJsonObject.get("year").getAsString());
            singleEntity.setPercentageShareInProfit(dataAsJsonObject.get("% share in the profit of the firm").getAsString());

            otherFirmPartnerList.add(singleEntity);
        }
        System.out.println("Final data list from json: "+otherFirmPartnerList);
        return otherFirmPartnerList;
    }
}


