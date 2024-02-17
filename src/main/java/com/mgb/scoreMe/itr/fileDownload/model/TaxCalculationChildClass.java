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
public class TaxCalculationChildClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int year;
    int incomeSalary;
    int incomeHouseProperty;
    String profitGainBusiness;
    String incomeShortTermCapitalGain;
    String incomeLongTermCapitalGain;
    String incomeOtherSources;
    String headWiseTotalIncome;
    String totalLoss;
    String grossTotalIncome;
    String totalDeductionChapterVIA;
    String deduction10AA;
    String incomeNotFormingTotalIncome;
    String totalTaxableIncome;
    String IncomeAtSpecialRate;
    String netAgrilIncome;
    String aggregateIncome;
    String deemedIncome;

}
