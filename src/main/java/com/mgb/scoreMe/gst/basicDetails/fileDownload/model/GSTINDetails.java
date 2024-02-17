package com.mgb.scoreMe.gst.basicDetails.fileDownload.model;

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
public class GSTINDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String gstinStatus;
    String constitutionOfBusiness;
    String dateOfRegistration;
    String principalPlaceOfBusinessAddress;
    String natureOfBusiness;
    String stateJurisdictionCode;
    String gstin;
    String dateOfCancellation;
    String centreJurisdictionCode;
    String tradeName;
    String lastUpdatedDate;
    String centreJurisdiction;
    String taxpayerType;
    String legalNameOfBusiness;
    String pan;
    String additionalPlaceOfBusinessAddress;
    String stateJurisdiction;

}
