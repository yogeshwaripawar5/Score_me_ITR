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
public class DirectorInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String year;
    String din;
    String companyName;
    String companyType;
    String companyPAN;
    String areSharesListed;
}
