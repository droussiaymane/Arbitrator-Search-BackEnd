package com.aaa.arbitrator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.arbitrator.repository.LanguageRepository;
import com.aaa.arbitrator.repository.arbitratorRepository;
import com.aaa.arbitrator.service.LanguageService;
import com.aaa.arbitrator.model.Languagedto;
import com.aaa.arbitrator.model.arbitdto;


@Service
public class LanguageServiceImpl implements LanguageService {
	
	@Autowired
	LanguageRepository languageRepository;

   
// List<Languagedto> getLanuage(String language_name);
    @Override
    public List<Languagedto> getLanuage(String language_name) { //String last_name
        List<Languagedto> results = languageRepository.getLanuage(language_name);
        return results;
    }

}
