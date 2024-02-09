package com.mgb.scoreMe.KYC.aadhaar.verifier.repo;

import com.mgb.scoreMe.KYC.aadhaar.verifier.model.AadhaarRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadhaarRequestRepo extends JpaRepository<AadhaarRequest,Integer> {

}
