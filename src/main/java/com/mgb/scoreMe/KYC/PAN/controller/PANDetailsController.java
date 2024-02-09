package com.mgb.scoreMe.KYC.PAN.controller;

import com.mgb.scoreMe.KYC.PAN.model.PANDetailResponse;
import com.mgb.scoreMe.KYC.PAN.model.PANRequest;
import com.mgb.scoreMe.KYC.PAN.model.PANVerificationResponse;
import com.mgb.scoreMe.KYC.PAN.service.PANDetailService;
import com.mgb.scoreMe.KYC.PAN.service.PANVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/KYC/PAN")
public class PANDetailsController {

    @Autowired
    PANDetailService panDetailService;

    @PostMapping("/details")
    public PANDetailResponse getPANVerResponse(@RequestBody PANRequest panRequest){
        System.out.println("inside PAN details controller "+panRequest.getPan());

        return panDetailService.getPANDetailsFromAPI(panRequest);
    }
}
