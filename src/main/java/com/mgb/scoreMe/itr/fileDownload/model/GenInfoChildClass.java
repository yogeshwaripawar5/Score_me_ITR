package com.mgb.scoreMe.itr.fileDownload.model;

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

public class GenInfoChildClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int year;
    String itr_type;
String original_or_revised;
String acknowledgement_number;
String name;
String old_name;
String date_of_birth;
String fathers_name;
String nature_of_employment;
String aadhaar_number;
String pan;
String registered_address;
String email_id;
String contact_number;
int number_of_house_properties;
String residential_status;
String country_of_residence;
String taxpayer_identification_number;
String original_return_filing_date;
    String revised_return_filing_date;
String status;
String date_of_incorporation;
String CIN_LLPIN;
String isCompany;
String holding_status;
String isFIIFIP;
String isRecognizedStartup;
String isPSU;
String isRBIOwned;
String isGovtShareHolding;
String companyType;
String isUnlisted;










}
