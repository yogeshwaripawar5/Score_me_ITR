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
public class TaxCalculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToMany(cascade = CascadeType.ALL)
    List<TaxCalculationChildClass> taxCalculationChildClass;
    @OneToMany(cascade = CascadeType.ALL)
    List<TaxLiabilityComputation> taxLiabilityComputation;
    @OneToOne(cascade = CascadeType.ALL)
    TaxDeductSource taxDeductSource;
    @OneToMany(cascade = CascadeType.ALL)
    List<TaxCollectSource> taxCollectSource;
}
