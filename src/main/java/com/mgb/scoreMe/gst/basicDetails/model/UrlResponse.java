package com.mgb.scoreMe.gst.basicDetails.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UrlResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToOne(cascade = CascadeType.ALL)
    UrlData data;
    String responseMessage;
    String responseCode;
}
