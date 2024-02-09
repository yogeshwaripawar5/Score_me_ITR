package com.mgb.scoreMe.KYC.PAN.controller;
import com.mgb.scoreMe.KYC.PAN.model.PANRequest;
import com.mgb.scoreMe.KYC.PAN.model.PANVerificationResponse;
import com.mgb.scoreMe.KYC.PAN.repo.PANRequestRepo;
import com.mgb.scoreMe.KYC.PAN.repo.PANVerificationResponseRepo;
import com.mgb.scoreMe.KYC.PAN.service.PANVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/KYC/PAN")
public class PANVerificationController {
    @Autowired
    PANVerificationService verificationService;

    @PostMapping("/verfication")
    public PANVerificationResponse getPANVerResponse(@RequestBody PANRequest panRequest){
        System.out.println("inside verification controller "+panRequest.getPan());

        return verificationService.getPANVerDetFromAPI(panRequest);
    }
}
