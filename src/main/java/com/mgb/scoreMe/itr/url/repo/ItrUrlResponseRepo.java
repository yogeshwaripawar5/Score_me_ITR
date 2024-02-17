package com.mgb.scoreMe.itr.url.repo;

import com.mgb.scoreMe.itr.url.model.ItrUrlResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItrUrlResponseRepo extends JpaRepository<ItrUrlResponse,Integer> {
}
