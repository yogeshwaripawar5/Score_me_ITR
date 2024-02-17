package com.mgb.scoreMe.itr.refId.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ItrEmailResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String responseMessage;
    String responseCode;
    @OneToOne (cascade = CascadeType.ALL)
    ItrResponseData data;
}
