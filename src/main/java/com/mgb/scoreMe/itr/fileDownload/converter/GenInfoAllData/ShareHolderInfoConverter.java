package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.ShareHolderInfo;

import java.util.ArrayList;
import java.util.List;

public class ShareHolderInfoConverter {
    public static List<ShareHolderInfo> convertToShareHolderInfoList(JsonObject shareHoldersInfoJson){
        System.out.println("INSIDE convertToShareHolderInfoList");

        List<ShareHolderInfo> shareHolderInfoList= new ArrayList<>();
        return shareHolderInfoList;
    }
}
