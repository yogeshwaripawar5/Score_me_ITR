package com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.repo;

import com.mgb.scoreMe.KYC.aadhaar.OTP.getOTP.model.AadhaarOTPResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadhaarOTPResponseRepo extends JpaRepository<AadhaarOTPResponse,Integer> {
}
