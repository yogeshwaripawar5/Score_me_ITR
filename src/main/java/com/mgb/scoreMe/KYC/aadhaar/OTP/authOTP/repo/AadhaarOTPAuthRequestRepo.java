package com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.repo;

import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadhaarOTPAuthRequestRepo extends JpaRepository<AadhaarOTPAuthRequest,Integer> {
}
