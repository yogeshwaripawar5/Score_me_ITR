package com.mgb.scoreMe.KYC.PAN.model;

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
public class PANRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String pan;
}
