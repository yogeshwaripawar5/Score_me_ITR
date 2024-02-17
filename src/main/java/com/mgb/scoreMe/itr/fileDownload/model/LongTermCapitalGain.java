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
public class LongTermCapitalGain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int year;
    String longTermGainImmovableProperty;
    String longTermGainSlumpSale;
    String longTermGainSaleOfBonds;
    String longTermGainListedSecurities;
    String longTermGainEquity;
    String nriLongTermGainSaleOfShares;
    String nriLongTermGainUnListedSecurities;
    String nriLongTermGainEquity;
    String nriLongTermGainSaleOfForeignExchange;
    String longTermOtherAsset;
}
