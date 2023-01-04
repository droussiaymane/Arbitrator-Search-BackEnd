package com.aaa.arbitrator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aaa.arbitrator.model.SubmitRatingdto;

public interface SubmitRatingRepository extends  JpaRepository<SubmitRatingdto, Long> {
	
	

}
