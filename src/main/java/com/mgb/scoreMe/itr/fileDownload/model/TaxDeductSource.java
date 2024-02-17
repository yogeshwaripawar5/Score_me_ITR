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
public class TaxDeductSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToMany(cascade = CascadeType.ALL)
    List<TDSFromSalary> tdsFromSalaries;
    @OneToMany(cascade = CascadeType.ALL)
    List<TDSOtherThanSalary> tdsOtherThanSalaries;
    @OneToMany(cascade = CascadeType.ALL)
    List<TDSFromImmovableProperty> tdsFromImmovableProperties;
}
