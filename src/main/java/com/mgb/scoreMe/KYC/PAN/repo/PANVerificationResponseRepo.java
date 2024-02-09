package com.mgb.scoreMe.KYC.PAN.repo;

import com.mgb.scoreMe.KYC.PAN.model.PANRequest;
import com.mgb.scoreMe.KYC.PAN.model.PANVerificationResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PANVerificationResponseRepo extends JpaRepository<PANVerificationResponse,Integer> {
}
