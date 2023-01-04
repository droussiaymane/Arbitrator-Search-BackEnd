package com.aaa.arbitrator.service;

import java.util.List;

import com.aaa.arbitrator.model.Profiledto;

public interface ProfileService {
	
	List<Profiledto> profileSearch(int contact_id);

}
