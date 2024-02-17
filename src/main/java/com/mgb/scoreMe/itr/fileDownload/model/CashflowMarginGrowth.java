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
public class CashflowMarginGrowth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String year;
    String growthInOperatingCashflowMargin;
    String growthInEquity;
    String grossCashAccruals;
    String profitAfterTaxGrowth;
    String salesGrowth;
}
