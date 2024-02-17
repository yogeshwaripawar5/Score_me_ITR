package com.mgb.scoreMe.gst.basicDetails.fileDownload.model;

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
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String valid;
    String methodOfFiling;
    String dateOfFiling;
    String arn;
    String returnType;
    String returnPeriod;

}
