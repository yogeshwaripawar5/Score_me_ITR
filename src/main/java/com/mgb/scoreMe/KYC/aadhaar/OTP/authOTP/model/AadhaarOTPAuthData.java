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
public class AadhaarOTPAuthData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String documentType;
    String name;
    String dateOfBirth;
    String gender;
    String careOf;
    String house;
    String street;
    String district;
    String subDistrict;
    String landmark;
    String locality;
    String postOfficeName;
    String state;
    String pincode;
    String country;
    String vtcName;
    String mobile;
    String email;
    String photoBase64;
    String xmlBase64;
}
