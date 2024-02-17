package com.mgb.scoreMe.gst.otpVerification.otpValidation.repo;

import com.mgb.scoreMe.gst.otpVerification.otpValidation.model.OtpValidationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpValidationRequestRepo extends JpaRepository<OtpValidationRequest,Integer> {
}
