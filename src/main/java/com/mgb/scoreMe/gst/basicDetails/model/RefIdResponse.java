package com.mgb.scoreMe.gst.basicDetails.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RefIdResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToOne(cascade = CascadeType.ALL)
    RefIdData data;
    String resposneMessage;
    String resposneCode;

}
