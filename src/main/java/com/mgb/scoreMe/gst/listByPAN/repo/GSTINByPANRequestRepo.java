package com.mgb.scoreMe.gst.listByPAN.repo;

import com.mgb.scoreMe.gst.listByPAN.model.GSTINByPANRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GSTINByPANRequestRepo extends JpaRepository<GSTINByPANRequest,Integer> {
}
