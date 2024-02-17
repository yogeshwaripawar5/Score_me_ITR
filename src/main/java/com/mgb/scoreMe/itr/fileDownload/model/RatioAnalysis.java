package com.mgb.scoreMe.itr.fileDownload.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RatioAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToMany(cascade = CascadeType.ALL)
    List<LiquidityAnalysis> liquidityAnalysisList;
    @OneToMany(cascade = CascadeType.ALL)
    List<AssetManagement> assetManagements;
    @OneToMany(cascade = CascadeType.ALL)
    List<LeverageRatio> leverageRatios;
    @OneToMany(cascade = CascadeType.ALL)
    List<CoverageRatio> coverageRatios;
    @OneToMany(cascade = CascadeType.ALL)
    List<ProfitabilityRatio> profitabilityRatios;
    @OneToMany(cascade = CascadeType.ALL)
    List<CashflowMarginGrowth> cashflowMarginGrowths;

}
