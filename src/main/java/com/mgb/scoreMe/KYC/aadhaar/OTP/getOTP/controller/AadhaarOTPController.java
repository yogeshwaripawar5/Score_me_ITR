package com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.controller;

import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadharOTPRequest;
import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.service.AadharOTPService;
import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadhaarOTPResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("KYC/aadhaar")
public class AadhaarOTPController {
@Autowired
AadharOTPService aadharOTPService;
    @PostMapping("/get-otp")
    public AadhaarOTPResponse getOTP(@RequestBody AadharOTPRequest otpRequest){
        System.out.println("inside adhar otp controller");
        return aadharOTPService.getAadhaarOTP(otpRequest);
    }

}
