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
public class EquityAndLiability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
int year;
String shareCapital;
String totalReserve;
String retainedEarnings;
String moneyReceivedAgainstShareWarrants;
String shareHoldersFund;
String shareApplicationMoneyPendingAllotment;
String longTermBorrowingsBonds;
    String longTermBorrowingsTermLoan;
    String longTermLiabilityRelatedParty;
    String securedLoanBank;
    String securedForeignCurrencyLoan;
    String unsecuredLoanBank;
    String unsecuredForeignCurrencyLoan;
    String tradePayableMoreThan6Months;
    String deferredTaxLiabilities;
    String longTermProvision;
    String longTermLoanAdvances;
    String otherLongTermLiabilities;
    String totalNonCurrentLiability;
    String loansRepayableOnDemand;
    String shortTermLiabilities;
    String currentMaturities;
    String deferredTaxLiability;
    String currentTaxLiability;
    String tradePayableLessThan6Months;
    String shortTermLoanAndAdvances;
    String shortTermProvisions;
    String otherCurrentLiabilities;
    String totalCurrentLiabilities;
    String totalLiabilities;
    String totalEquityAndLiabilities;
}
