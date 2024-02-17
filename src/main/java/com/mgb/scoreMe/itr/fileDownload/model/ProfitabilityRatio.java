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
public class ProfitabilityRatio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String year;
    String operatingProfitMargin;
    String netProfitMargin;
    String ebidtaMargin;
    String returnOnAssets;
    String returnOnEquity;
    String grossCashAccrualMargin;
    String operatingCashFlowMargin;
    String returnOnCapitalEmployed;
}
