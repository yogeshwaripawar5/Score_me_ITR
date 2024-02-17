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
public class GSTINInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String state;
    String gstin;
    String status;

}
