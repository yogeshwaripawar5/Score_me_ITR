package com.mgb.scoreMe.KYC.PAN.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PANDetailData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    String address;
    String gender ;
    String aadhaarLinked ;
             String dob;
             String fullName ;
    String category ;
    String maskedAadhaarNumber ;
    String pan ;

}
