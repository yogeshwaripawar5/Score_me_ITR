package com.mgb.scoreMe.gst.basicDetails.repo;

import com.mgb.scoreMe.gst.basicDetails.model.UrlResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlResponseRepo extends JpaRepository<UrlResponse,Integer> {
}
