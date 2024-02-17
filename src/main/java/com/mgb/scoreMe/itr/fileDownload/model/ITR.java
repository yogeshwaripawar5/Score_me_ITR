package com.mgb.scoreMe.itr.fileDownload.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ITR {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToOne(cascade = CascadeType.ALL)
GenInfo general_information;
    @OneToOne(cascade = CascadeType.ALL)
TaxDetail tax_details;
    @OneToOne(cascade = CascadeType.ALL)
TaxCalculation tax_calculation;
    @OneToOne(cascade = CascadeType.ALL)
BalanceSheet balance_sheet;
    @OneToOne(cascade = CascadeType.ALL)
    ProfitAndLoss profit_and_loss_statement;
    @OneToOne(cascade = CascadeType.ALL)
    RatioAnalysis ratio_analysis;
}
