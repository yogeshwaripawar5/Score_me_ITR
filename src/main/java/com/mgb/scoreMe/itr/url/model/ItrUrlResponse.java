package com.mgb.scoreMe.itr.url.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ItrUrlResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String responseMessage;
    String responseCode;
    @OneToOne(cascade = CascadeType.ALL)
    ItrUrlData data;

}
