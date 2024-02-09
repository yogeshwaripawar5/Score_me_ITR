package com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.repo;

import com.mgb.scoreMe.KYC.aadhaar.OTP.authOTP.model.AadhaarOTPAuthResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadhaarOTPAuthResponseRepo extends JpaRepository<AadhaarOTPAuthResponse,Integer> {
}
