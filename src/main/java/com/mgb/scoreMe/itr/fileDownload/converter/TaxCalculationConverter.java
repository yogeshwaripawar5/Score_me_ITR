package com.mgb.scoreMe.itr.fileDownload.converter;

import com.google.gson.JsonObject;
import com.mgb.scoreMe.itr.fileDownload.model.TaxCalculation;
import com.mgb.scoreMe.itr.fileDownload.model.TaxDetail;

public class TaxCalculationConverter {

    public static TaxCalculation convertStringToTaxCalculation(JsonObject taxCalculationJson){
        TaxCalculation taxCalculation=new TaxCalculation();


        return taxCalculation;
    }
}
