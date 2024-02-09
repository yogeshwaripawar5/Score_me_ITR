package com.mgb.scoreMe.gst.basicDetails.repo;

import com.mgb.scoreMe.gst.basicDetails.model.RefIdResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface RefIdResposneRepo extends JpaRepository<RefIdResponse,Integer> {

}
