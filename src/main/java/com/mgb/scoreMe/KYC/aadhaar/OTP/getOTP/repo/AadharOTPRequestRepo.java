package com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.repo;

import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadharOTPRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadharOTPRequestRepo extends JpaRepository<AadharOTPRequest,Integer> {
}
