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
public class TaxLiabilityComputation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int year;
    String totalTaxPayableOnDeemedIncome;
    String taxPayableOnTotalIncome;
    String rebate;
    String taxPayableAfterRebate;
    String totalSurcharge;
    String healthEducationCess;
    String grossTaxLiability;
    String grossTaxPayable;
    String creditUnderSection115J   ;
    String taxPayableAfterCreditUnderSection115J;
    String reliefUnderSection89;
    String totalTaxRelief;
    String netTaxLiability;
    String totalTaxInterestFeesPayable;
    String aggregateLiability;
    String totalTDS;
    String totalAdvanceSelfAssessmentTax;
    String totalTCS;
    String totalTaxPaid;
    String amountPayable;
    String refund;
}
