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
public class ShortTermCapitalGain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int year;
    String shortTermGainImmovable;
    String shortTermGainSlumpSale;
    String shortTermGainEquity;
    String shortTermGainSaleOfShares;
    String shortTermGainSaleOfSecurities;
    String shortTermGainOtherAssets;
}
