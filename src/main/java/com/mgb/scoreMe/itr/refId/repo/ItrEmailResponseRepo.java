package com.mgb.scoreMe.itr.refId.repo;

import com.mgb.scoreMe.itr.refId.model.ItrEmailResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItrEmailResponseRepo extends JpaRepository<ItrEmailResponse,Integer> {

}
