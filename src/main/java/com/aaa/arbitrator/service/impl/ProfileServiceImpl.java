package com.aaa.arbitrator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.arbitrator.repository.ProfileRepository;
import com.aaa.arbitrator.service.ProfileService;
import com.aaa.arbitrator.model.Profiledto;

@Service
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	ProfileRepository profileRepository;
	
	@Override
	public List<Profiledto> profileSearch(int contact_id){
		
		List<Profiledto> results = profileRepository.profileSearch(contact_id);
		 return results;
		
	}

}
