package com.mgb.scoreMe.KYC.aadhaar.verifier.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AadhaarResponse  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String referenceId;
    String responseMessage;
    String responseCode;
@OneToOne(cascade = CascadeType.ALL)
    AadhaarResponseData data;
}
