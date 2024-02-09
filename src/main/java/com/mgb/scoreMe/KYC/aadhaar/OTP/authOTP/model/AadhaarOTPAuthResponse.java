package com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AadhaarOTPAuthResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
@OneToOne(cascade = CascadeType.ALL)
    AadhaarOTPAuthData data;
String referenceId;
String responseMessage;
String responseCode;
}
