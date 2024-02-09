package com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AadhaarOTPAuthRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String otp;
    String aadhaar_number;
}
