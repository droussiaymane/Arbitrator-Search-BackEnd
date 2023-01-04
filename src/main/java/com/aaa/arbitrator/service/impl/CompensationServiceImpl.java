package com.aaa.arbitrator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.arbitrator.repository.CompensationRepository;
import com.aaa.arbitrator.service.CompensationService;
import com.aaa.arbitrator.model.Compensationdto;

@Service
public class CompensationServiceImpl implements CompensationService {
	
	@Autowired
	CompensationRepository compensationRepository;
	
	@Override
	public List<Compensationdto>compensationSearch(int contact_id){
		
		List<Compensationdto> results = compensationRepository.compensationSearch(contact_id);
		return results;
	}
	

}
