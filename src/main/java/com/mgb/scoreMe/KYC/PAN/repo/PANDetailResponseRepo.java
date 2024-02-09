package com.mgb.scoreMe.KYC.PAN.repo;

import com.mgb.scoreMe.KYC.PAN.model.PANDetailResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PANDetailResponseRepo extends JpaRepository<PANDetailResponse,Integer> {
}
