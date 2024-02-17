package com.mgb.scoreMe.gst.otpVerification.otpGeneration.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GstOtpResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String responseMessage;
    String responseCode;
    @OneToOne(cascade = CascadeType.ALL)
    GstOtpResponseData gstOtpResponseData;
    
}
