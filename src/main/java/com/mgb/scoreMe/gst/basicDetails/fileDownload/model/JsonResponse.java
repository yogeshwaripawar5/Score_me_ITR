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
public class JsonResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
String pan;
@OneToMany(cascade = CascadeType.ALL)
List<GSTINInfo> gstinInfo;
    @OneToOne(cascade = CascadeType.ALL)
GSTINFilingDetails gstinFilingDetails;
    @OneToMany(cascade = CascadeType.ALL)
List<GSTINDetails> gstinDetails;
}
