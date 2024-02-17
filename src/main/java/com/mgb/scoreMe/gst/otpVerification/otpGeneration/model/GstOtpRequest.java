package com.mgb.scoreMe.gst.otpVerification.otpGeneration.model;

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
public class GstOtpRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String gstin;
    String username;
    String email;

}
