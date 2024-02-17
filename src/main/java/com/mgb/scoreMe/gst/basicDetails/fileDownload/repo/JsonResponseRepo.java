package com.mgb.scoreMe.gst.basicDetails.fileDownload.repo;

import com.mgb.scoreMe.gst.basicDetails.fileDownload.model.JsonResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonResponseRepo extends JpaRepository<JsonResponse,Integer> {
}
