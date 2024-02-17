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
public class IncomeOtherSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int year;
    int incomeOtherSources;
    int incomeDividend;
    int incomeInterest;
    String rentalIncome;
    String incomeImmovableProperties;
    String otherIncome;
    String incomeAtSpecialRate;
    String adjustment;
    String incomeAtNormalRate;



}
