package com.mgb.scoreMe.KYC.PAN.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PANVerificationResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String referenceId;
    String responseMessage;
    String responseCode;
    @OneToOne(cascade = CascadeType.ALL)
    PANVerificationData data;
}
