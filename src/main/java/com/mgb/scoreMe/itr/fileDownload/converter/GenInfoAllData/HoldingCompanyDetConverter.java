package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.HoldingCompanyDet;

import java.util.ArrayList;
import java.util.List;

public class HoldingCompanyDetConverter {

    public static List<HoldingCompanyDet> convertToHoldingCompanyDetList(JsonObject holdingCompaniesDetailsJson){
        System.out.println("INSIDE convertToHoldingCompanyDetList");

        List<HoldingCompanyDet> holdingCompanyDetList= new ArrayList<>();
        return holdingCompanyDetList;
    }
}
