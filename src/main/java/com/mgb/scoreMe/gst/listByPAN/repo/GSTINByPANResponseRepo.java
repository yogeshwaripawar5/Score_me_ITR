package com.mgb.scoreMe.gst.listByPAN.repo;

import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GSTINByPANResponseRepo extends JpaRepository<GSTINByPANResponse,Integer> {
}
