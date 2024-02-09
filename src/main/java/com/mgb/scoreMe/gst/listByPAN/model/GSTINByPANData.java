package com.mgb.scoreMe.gst.listByPAN.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GSTINByPANData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String referenceId;
//@OneToMany(cascade = CascadeType.ALL)
//    List<GSTINByPANList> gstinList;
    String gstinList;
}
