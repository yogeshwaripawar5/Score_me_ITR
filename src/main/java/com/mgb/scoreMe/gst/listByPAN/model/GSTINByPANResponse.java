package com.mgb.scoreMe.gst.listByPAN.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GSTINByPANResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String responseMessage;
    String responseCode;
    @OneToOne(cascade = CascadeType.ALL)
    GSTINByPANData data;
}
