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
public class TaxAssessmentDet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
@OneToMany(cascade = CascadeType.ALL)
List<IncomeHouseProperty> incomeHouseProperties;
@OneToMany(cascade = CascadeType.ALL)
List<ProfitGainBusiness> profitGainBusinesses;
@OneToMany(cascade = CascadeType.ALL)
    List<IncomeProfessin44AD> incomeProfessin44AD;
@OneToMany(cascade = CascadeType.ALL)
    List<IncomeProfessin44ADA> incomeProfessin44ADA;
@OneToMany(cascade = CascadeType.ALL)
    List<IncomeGoodCarriage44AE> incomeGoodCarriage44AE;
@OneToOne(cascade = CascadeType.ALL)
    InfoIncomeInvestment infoIncomeInvestment;
}
