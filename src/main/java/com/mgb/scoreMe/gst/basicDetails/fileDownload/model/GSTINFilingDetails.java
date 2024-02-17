package com.mgb.scoreMe.gst.basicDetails.fileDownload.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GSTINFilingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToMany(cascade = CascadeType.ALL)
    List<Detail> details;
}
