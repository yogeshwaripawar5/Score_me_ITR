package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.GenInfoChildClass;

import java.util.ArrayList;
import java.util.List;

public class GenInfoChildClassConverter {

    public static List<GenInfoChildClass> convertToGenInfoChildClassList(JsonObject genInfoListJson){
        System.out.println("INSIDE convertToGenInfoChildClassList");
        List<GenInfoChildClass> genInfoChildClasses=new ArrayList<>();
        
        return genInfoChildClasses;
    }
}
