package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.PartnerChangeDet;

import java.util.ArrayList;
import java.util.List;

public class PartnerChangeDetConverter {

    public static List<PartnerChangeDet> convertToPartnerChangeDetList(JsonObject changeOfPartnersJson){
        System.out.println("INSIDE convertToPartnerChangeDetList");

        List<PartnerChangeDet> partnerChangeDetList=new ArrayList<>();
        return partnerChangeDetList;
    }
}
