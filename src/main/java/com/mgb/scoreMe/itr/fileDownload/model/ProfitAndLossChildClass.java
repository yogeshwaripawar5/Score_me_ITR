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
public class ProfitAndLossChildClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String year;
    String saleOfGoods;
    String saleOfServices;
    String receiptsProfession;
    String otherOperatingIncome;
    String revenueFromOperation;
    String openingInventories;
    String closingInventories;
    String purchases;
    String factoryOverHeads;
    String directWages;
    String directExpenses;
    String otherDirectCost;
    String grossProfit;
    String freightOutward;
    String consumptionOfStores;
    String powerAndFuel;
    String employeeBenefitExpenses;
    String sellingGenAdminExpenses;
    String sellingPromotionAvExpenses;
    String otherExpenses;
    String totalExpenses;
    String ebitda;
    String depreciationAndAmortization;
    String ebit;
    String financeCost;
    String profitAfterInterestBeforeTax;
    String otherNonOperatingIncome;
    String otherNonOperatingExpense;
    String profitBeforeTax;
    String currentTax;
    String deferredTax;
    String profitAfterTax;
    String retainedProfit;
}
