package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.BusinessNature;
import com.mgb.scoreMe.itr.fileDownload.model.GrossReceiptGST;

import java.util.ArrayList;
import java.util.List;

public class GrossReceiptGSTConverter {

    public static List<GrossReceiptGST> convertToGrossReceiptGSTList(JsonObject grossReceiptJson){
        System.out.println("INSIDE grossReceiptGSTList");

        List<GrossReceiptGST> grossReceiptGSTList=new ArrayList<>();

        return grossReceiptGSTList;
    }
}
