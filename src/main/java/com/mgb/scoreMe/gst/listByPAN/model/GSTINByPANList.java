package com.mgb.scoreMe.gst.listByPAN.model;

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
public class GSTINByPANList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String gstin;
}
