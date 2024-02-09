package com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.controller;

import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthRequest;
import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthResponse;
import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.service.AadhaarOTPAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("KYC/aadhaar")
public class AadhaarOTPAuthController {
    @Autowired
    AadhaarOTPAuthService otpAuthService;

    @PostMapping("/auth-otp")
    public AadhaarOTPAuthResponse getAadhaarOTPAuthResponse(@RequestBody AadhaarOTPAuthRequest otpAuthRequest){
        System.out.println("inside auth otp controller");
        return otpAuthService.getAadhaarOTPResult(otpAuthRequest);
    }

}
