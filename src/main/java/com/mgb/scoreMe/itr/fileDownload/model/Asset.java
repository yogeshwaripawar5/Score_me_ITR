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
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String year;
    String tangibleAssetsGross;
    String intangibleAssetsGross;
    String capitalWorkInProgress;
    String intangibleAssetUnderDev;
    String totalGrossBlock;
    String depreciationAndAmortization;
    String impairementLosses;
    String totalFixedAssets;
    String nonCurrentInvestment;
    String tradeReceivableMoreThank6;
    String deferredTaxAssets;
    String longTermLoanAndAdvances;
    String otherNonCurrentAssets;
    String totalNonCurrentAssets;
    String currentInvestment;
    String inventories;
    String tradeReceivableLessThank6;;
    String cashAndCashEqui;
    String shortTermLoanAndAdvances;
    String currentTaxAssets;
    String otherCurrentAssets;
    String totalCurrentAssets;
    String totalAssets;
    String netWorth;
}
