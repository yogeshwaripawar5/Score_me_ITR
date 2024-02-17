package com.mgb.scoreMe.itr.refId.repo;

import com.mgb.scoreMe.itr.refId.model.ItrEmailRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItrEmailRequestRepo extends JpaRepository<ItrEmailRequest,Integer> {
}
