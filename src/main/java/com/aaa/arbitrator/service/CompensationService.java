package com.aaa.arbitrator.service;

import java.util.List;

import com.aaa.arbitrator.model.Compensationdto;

public interface CompensationService {
	
	List<Compensationdto> compensationSearch(int contact_id);

}
