package com.aaa.arbitrator.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.aaa.arbitrator.repository.arbitratorRepository;
import com.aaa.arbitrator.service.arbitratorService;
import com.aaa.arbitrator.model.arbitdto;


@Service
public class arbitratorServiceImpl implements arbitratorService {
	
	@Autowired
	arbitratorRepository arbitratorRepository;

   

    @Override
    public List<arbitdto> arbitratorSearch(String language_name, String last_name,int page) { //String last_name

        Page<arbitdto> results = arbitratorRepository.findAllByLanguageNameAndLastName(language_name, last_name, PageRequest.of(page, 10));
        List<arbitdto> myresults=results.get().collect(Collectors.toList());
        return myresults;
    }

    @Override
    public List<arbitdto> arbitratorSearchgetAllResults2(int page) {
        Page<arbitdto> results = arbitratorRepository.findAll(PageRequest.of(page, 10));
        List<arbitdto> myresults=results.get().collect(Collectors.toList());

        return myresults;
    }

    @Override
    public List<arbitdto> arbitratorSearchgetAllResults() {
        List<arbitdto> results = arbitratorRepository.arbitratorSearchgetAllResults();
        return results;
    }
    // List<arbitdto> ArbitsearchLnLg(String language_name, String last_name);
    
    @Override
    public List<arbitdto> ArbitsearchLnLg(String language_name, String last_name,String City) { //String last_name
        List<arbitdto> results = arbitratorRepository.ArbitsearchLnLg(language_name, last_name, City);
        return results;
    }
    
    //List<arbitdto> ArbitsearchLgcty(String language_name, String City);
    
    @Override
    public List<arbitdto> ArbitsearchLgcty(String language_name,String City) { //String last_name
        List<arbitdto> results = arbitratorRepository.ArbitsearchLgcty(language_name, City);
        return results;
    }
    
    // List<arbitdto> ArbitsearchLname(String lname);
    
    @Override
    public List<arbitdto> ArbitsearchLname(String lname) { //String last_name
        List<arbitdto> results = arbitratorRepository.ArbitsearchLname(lname);
        return results;
    }
    
    //List<arbitdto> Arbitsearchcity(String City);
    
    @Override
    public List<arbitdto> Arbitsearchcity(String City) { //String last_name
        List<arbitdto> results = arbitratorRepository.Arbitsearchcity(City);
        return results;
    }
    //List<arbitdto> Arbitsearchstate(String state);
    
    @Override
    public List<arbitdto> Arbitsearchstate(String state) { //String last_name
        List<arbitdto> results = arbitratorRepository.Arbitsearchstate(state);
        return results;
    }
    //List<arbitdto> Arbitsearchlanguagelname(String languages, String last_name);
    
    @Override
    public List<arbitdto> Arbitsearchlanguagelname(String languages, String last_name) { //String last_name
        List<arbitdto> results = arbitratorRepository.Arbitsearchlanguagelname(languages, last_name);
        return results;
    }
    // List<arbitdto> ArbitsearchLanguage(String language_name);
    
    @Override
    public List<arbitdto> ArbitsearchLanguage(String languages) { //String last_name
        List<arbitdto> results = arbitratorRepository.ArbitsearchLanguage(languages);
        return results;
    }
    
  //1..
    @Override
    public List<arbitdto>ArbitsearchJudgeApple(){    	
    	List<arbitdto> results = arbitratorRepository.ArbitsearchJudgeApple();
    	return results;
    }
    
  //2..
    @Override
    public List<arbitdto>ArbitsearchJudgeState(){    	
    	List<arbitdto> results = arbitratorRepository.ArbitsearchJudgeState();
    	return results;
    }
    
  //3..
    @Override
    public List<arbitdto>ArbitsearchAccounting(){    	
    	List<arbitdto> results = arbitratorRepository.ArbitsearchAccounting();
    	return results;
    }
    
  //4..
    @Override
    public List<arbitdto>ArbitsearchConstruction(){    	
    	List<arbitdto> results = arbitratorRepository.ArbitsearchConstruction();
    	return results;
    }
    
    //5..
    @Override
    public List<arbitdto>ArbitsearchRealEstate(){    	
    	List<arbitdto> results = arbitratorRepository.ArbitsearchRealEstate();
    	return results;
    }
    
    //6.. List<arbitdto>ArbitsearchJudgeAppleandState();
    @Override
    public List<arbitdto>ArbitsearchJudgeAppleandState(){    	
    	List<arbitdto> results = arbitratorRepository.ArbitsearchJudgeAppleandState();
    	return results;
    }
    //7.. List<arbitdto>ArbitsearchJudgeAplSteAndAcc();
    @Override
    public List<arbitdto>ArbitsearchJudgeAplSteAndAcc(){    	
    	List<arbitdto> results = arbitratorRepository.ArbitsearchJudgeAplSteAndAcc();
    	return results;
    }

}
