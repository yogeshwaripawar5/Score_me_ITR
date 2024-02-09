package com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class AadharOTPRequestAPI {

    String aadhaar_number;
}
