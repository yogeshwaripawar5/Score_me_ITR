package com.mgb.scoreMe.itr.fileDownload.converter;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.*;

import java.util.ArrayList;
import java.util.List;

public class GenInfoConverter {

    public static GenInfo convertStringToGenInfo(JsonObject genInfoJson){

        GenInfo genInfo=new GenInfo();
        JsonObject genInfoListJson=genInfoJson.get("General Information").getAsJsonObject();
        List<GenInfoChildClass> genInfoChildClassList=GenInfoChildClassConverter.convertToGenInfoChildClassList(genInfoListJson);

        JsonObject businessNatureJson=genInfoJson.get("Nature of Business/Profession").getAsJsonObject();
        List<BusinessNature> businessNatureList=BusinessNatureConverter.convertToBusinessNatureList(businessNatureJson);

        JsonObject grossReceiptJson=genInfoJson.get("Gross Receipt Reported for GST").getAsJsonObject();
        List<GrossReceiptGST> grossReceiptGSTList=GrossReceiptGSTConverter.convertToGrossReceiptGSTList(grossReceiptJson);

        //Information of all Bank Accounts
        JsonObject bankAccountInfoJson=genInfoJson.get("Information of all Bank Accounts").getAsJsonObject();
        List<BankAcctInfo> bankAcctInfoList=BankAcctInfoConverter.convertToBankAcctInfoList(bankAccountInfoJson);

        //Details of Key Persons
        JsonObject keyPersonDetailsJson=genInfoJson.get("Details of Key Persons").getAsJsonObject();
        List<KeyPersonDet> keyPersonDetList=KeyPersonDetConverter.convertToKeyPersonDetList(keyPersonDetailsJson);

        //Details of the Holding Companies
        JsonObject holdingCompaniesDetailsJson=genInfoJson.get("Details of the Holding Companies").getAsJsonObject();
        List<HoldingCompanyDet> holdingCompanyDetList=HoldingCompanyDetConverter.convertToHoldingCompanyDetList(holdingCompaniesDetailsJson);

        //Details of Change of Partners/Members
        JsonObject changeOfPartnersJson=genInfoJson.get("Details of Change of Partners/Members").getAsJsonObject();
        List<PartnerChangeDet> partnerChangeDetList=PartnerChangeDetConverter.convertToPartnerChangeDetList(changeOfPartnersJson);

        //ShareHolders Information
        JsonObject shareHoldersInfoJson=genInfoJson.get("ShareHolders Information").getAsJsonObject();
        List<ShareHolderInfo> shareHolderInfoList=ShareHolderInfoConverter.convertToShareHolderInfoList(shareHoldersInfoJson);

        //Other Firms in which the Entity is a Partner
        JsonObject otherFirmsPartnerJson=genInfoJson.get("Othe  r Firms in which the Entity is a Partner").getAsJsonObject();
        List<OtherFirmPartner> otherFirmPartnerList=OtherFirmPartnerConverter.convertToOtherFirmPartnerList(otherFirmsPartnerJson);

        genInfo.setGeneral_information(genInfoChildClassList);
        genInfo.setBusinessNatures(businessNatureList);
        genInfo.setGrossReceiptGST(grossReceiptGSTList);
        genInfo.setBankAcctInfos(bankAcctInfoList);
        genInfo.setKeyPersonDets(keyPersonDetList);
        genInfo.setHoldingCompanyDets(holdingCompanyDetList);
        genInfo.setPartnerChangeDets(partnerChangeDetList);
        genInfo.setShareHolderInfos(shareHolderInfoList);
        genInfo.setOtherFirmPartners(otherFirmPartnerList);

        return genInfo;
    }

}
