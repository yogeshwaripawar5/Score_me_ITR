package com.mgb.scoreMe.itr.fileDownload.converter.GenInfoAllData;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.BankAcctInfo;

import java.util.ArrayList;
import java.util.List;

public class BankAcctInfoConverter {

        public  static List<BankAcctInfo> convertToBankAcctInfoList(JsonObject bankAccountInfoJson){
            System.out.println("INSIDE convertToBankAcctInfoList");

            List<BankAcctInfo> bankAcctInfoList=new ArrayList<>();
            return bankAcctInfoList;
        }
}
