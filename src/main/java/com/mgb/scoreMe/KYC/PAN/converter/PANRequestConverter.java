package com.mgb.scoreMe.KYC.PAN.converter;

import com.mgb.scoreMe.KYC.PAN.model.PANRequest;
import com.mgb.scoreMe.KYC.PAN.model.PANRequestAPI;

public class PANRequestConverter {

    public static PANRequestAPI convertPANRequestForAPI(PANRequest panRequest){
        return new PANRequestAPI(panRequest.getPan());
    }
}
