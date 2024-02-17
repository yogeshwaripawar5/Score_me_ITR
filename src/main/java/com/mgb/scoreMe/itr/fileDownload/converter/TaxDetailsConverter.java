package com.mgb.scoreMe.itr.fileDownload.converter;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.TaxDetail;

public class TaxDetailsConverter {
    public static TaxDetail convertStringToTaxDetail(JsonObject taxDetailsJson){
        TaxDetail taxDetail=new TaxDetail();


        return taxDetail;
    }
}
