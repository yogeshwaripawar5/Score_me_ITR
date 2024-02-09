package com.mgb.scoreMe.KYC.PAN.repo;

import com.mgb.scoreMe.KYC.PAN.model.PANRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PANRequestRepo extends JpaRepository<PANRequest,Integer> {
}
