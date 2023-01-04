package com.aaa.arbitrator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.arbitrator.repository.ArbitratorImage;
import com.aaa.arbitrator.service.ArbitratorImageService;
import com.aaa.arbitrator.model.Compensationdto;
import com.aaa.arbitrator.model.Imagedto;

@Service
public class ArbitratorImageServiceImpl implements ArbitratorImageService {
	
	@Autowired
	ArbitratorImage ArbitratorImage;
	
	@Override
	public List<Imagedto>arbitratorgetImage(int contact_id){
		
		List<Imagedto> results = ArbitratorImage.arbitratorgetImage(contact_id);
		return results;
	}

}
