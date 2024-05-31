package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.KeyPersonDet;

import java.util.ArrayList;
import java.util.List;

public class KeyPersonDetConverter {
    public static List<KeyPersonDet> convertToKeyPersonDetList(JsonObject keyPersonDetailsJson){
        System.out.println("INSIDE convertToKeyPersonDetList");

        List<KeyPersonDet> keyPersonDetList = new ArrayList<>();
        return  keyPersonDetList;
    }
}
