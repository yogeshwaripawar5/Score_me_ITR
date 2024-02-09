package com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
public class AadhaarOTPAuthAPIRequest {
    String otp;
    String aadhaar_number;
}
