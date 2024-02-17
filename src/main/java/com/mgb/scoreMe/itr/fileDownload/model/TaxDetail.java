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
public class TaxDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToMany(cascade = CascadeType.ALL)
    List<DirectorInfo> directorInfo;
    @OneToMany(cascade = CascadeType.ALL)
    List<PartnerInfo> partnerInfo;
    @OneToMany(cascade = CascadeType.ALL)
    List<AuditorInfo> auditorInfo;
    @OneToMany(cascade = CascadeType.ALL)
    List<EmployerInfo> employerInfo;
    @OneToMany(cascade = CascadeType.ALL)
    List<SalaryInfo> salaryInfo;
    @OneToMany(cascade = CascadeType.ALL)
    List<HousePropertyInfo> housePropertyInfo;
    @OneToOne(cascade = CascadeType.ALL)
    TaxAssessmentDet taxAssessmentDet;
}
