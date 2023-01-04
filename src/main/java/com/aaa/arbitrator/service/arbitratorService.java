package com.aaa.arbitrator.service;

import java.util.List;

import com.aaa.arbitrator.model.arbitdto;

public interface arbitratorService {
	
	List<arbitdto> arbitratorSearch(String language_name, String last_name,int page); //arbitratorSearchgetAllResults  String last_name
	
	List<arbitdto> arbitratorSearchgetAllResults2(int page);
	List<arbitdto> arbitratorSearchgetAllResults();

	List<arbitdto> ArbitsearchLnLg(String language_name, String last_name, String City);
	
	List<arbitdto> ArbitsearchLgcty(String language_name, String City);
	
	List<arbitdto> ArbitsearchLname(String lname);
	
	List<arbitdto> Arbitsearchcity(String City);
	
	List<arbitdto> Arbitsearchstate(String state);
	
	List<arbitdto> Arbitsearchlanguagelname(String languages, String last_name);
	
	List<arbitdto> ArbitsearchLanguage(String language_name);
	
	// Criteria ....
	
	List<arbitdto>ArbitsearchJudgeApple();

	List<arbitdto>ArbitsearchJudgeState();

	List<arbitdto>ArbitsearchAccounting();

	List<arbitdto>ArbitsearchConstruction();

	List<arbitdto>ArbitsearchRealEstate();
	
	List<arbitdto>ArbitsearchJudgeAppleandState();
	
	List<arbitdto>ArbitsearchJudgeAplSteAndAcc();

}
