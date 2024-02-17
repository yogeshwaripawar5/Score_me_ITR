package com.mgb.scoreMe.itr.fileDownload.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GenInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @OneToMany(cascade = CascadeType.ALL)
    List<GenInfoChildClass> general_information;
    @OneToMany(cascade = CascadeType.ALL)
    List<BusinessNature> businessNatures;
    @OneToMany(cascade = CascadeType.ALL)
    List<GrossReceiptGST> grossReceiptGST;
    @OneToMany(cascade = CascadeType.ALL)
    List<BankAcctInfo> bankAcctInfos;
    @OneToMany(cascade = CascadeType.ALL)
    List<KeyPersonDet> keyPersonDets;
    @OneToMany(cascade = CascadeType.ALL)
    List<HoldingCompanyDet> holdingCompanyDets;
    @OneToMany(cascade = CascadeType.ALL)
    List<PartnerChangeDet> partnerChangeDets;
    @OneToMany(cascade = CascadeType.ALL)
    List<ShareHolderInfo> shareHolderInfos;
    @OneToMany(cascade = CascadeType.ALL)
    List<OtherFirmPartner> otherFirmPartners;

}
