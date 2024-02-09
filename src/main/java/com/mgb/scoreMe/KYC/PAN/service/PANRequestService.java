package com.mgb.scoreMe.KYC.PAN.service;

import com.mgb.scoreMe.KYC.PAN.model.PANRequest;
import com.mgb.scoreMe.KYC.PAN.repo.PANRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PANRequestService {
    @Autowired
    PANRequestRepo panRequestRepo;


}
