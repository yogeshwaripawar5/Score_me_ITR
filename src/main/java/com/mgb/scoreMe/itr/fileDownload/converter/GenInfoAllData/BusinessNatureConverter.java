package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.BusinessNature;

import java.util.ArrayList;
import java.util.List;

public class BusinessNatureConverter {
    public static List<BusinessNature> convertToBusinessNatureList(JsonObject businessNatureJson){
        System.out.println("INSIDE convertToBusinessNatureList");

        List<BusinessNature> businessNatureList=new ArrayList<>();

        return businessNatureList;
    }

}
