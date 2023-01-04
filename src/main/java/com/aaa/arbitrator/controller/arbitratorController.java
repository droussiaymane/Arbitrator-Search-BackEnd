package com.aaa.arbitrator.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.aaa.arbitrator.repository.arbitratorRepository;
import com.aaa.arbitrator.service.arbitratorService;
import com.aaa.arbitrator.model.arbitdto;
//import org.springframework.ui.Model;

import com.aaa.arbitrator.service.ProfileService;
import com.aaa.arbitrator.model.Profiledto;
import com.aaa.arbitrator.model.SubmitRatingdto;
import com.aaa.arbitrator.service.CompensationService;
import com.aaa.arbitrator.model.Compensationdto;

import com.aaa.arbitrator.service.LanguageService;
import com.aaa.arbitrator.model.Languagedto;

import com.aaa.arbitrator.repository.SubmitRatingRepository;

import com.aaa.arbitrator.repository.ArbitratorImage;
import com.aaa.arbitrator.model.Imagedto;
import com.aaa.arbitrator.service.ArbitratorImageService;

@RestController
@RequestMapping("/arbitrator")
public class arbitratorController {
	
	@Autowired
	arbitratorService caseService;
	
	@Autowired
	ProfileService profileService;
	
	@Autowired
	CompensationService compensationService;
	
	@Autowired
	LanguageService languageService;
	
	@Autowired
	SubmitRatingRepository submitRatingRepository;

	@Autowired
	ArbitratorImage ArbitratorImageRepo;
	@Autowired
	ArbitratorImageService ArbitratorImageService;

//    @GetMapping("/search/{language_name},{last_name}")
//    public List<arbitdto> arbitratorSearch(@PathVariable String language_name, @PathVariable String last_name){
//    	
//    
//    		return caseService.arbitratorSearch(language_name,last_name);
//    	   
//    		
//    	} @RequestParam(value = "metaData", ) String metaDat


	@GetMapping("/search/multisearch2")
	public ResponseEntity<List<arbitdto>>getArbitsearchLnLg2(@RequestParam(value ="lang", required = false) String lang,
															 @RequestParam(value ="lname", required = false) String lname,
															 @RequestParam(value ="page", required = false) String page)

	{if(page==null){
		page="0";
	}
		 			 return new ResponseEntity<List<arbitdto>>(caseService.arbitratorSearch(lang,lname, Integer.parseInt(page)), HttpStatus.OK);

	}

@GetMapping("/search/multisearch")
	public ResponseEntity<List<arbitdto>>getArbitsearchLnLg(@RequestParam(value ="lang", required = false) String lang, 
			@RequestParam(value ="lname", required = false) String lname,
			@RequestParam(value ="city", required = false) String city,
			@RequestParam(value ="state", required = false) String state,
			@RequestParam(value ="JudgeApple", required = false) String JudgeApple,
			@RequestParam(value ="JudgeState", required = false) String JudgeState,
			@RequestParam(value ="Accounting", required = false) String Accounting,
			@RequestParam(value ="Construction", required = false) String Construction,
			@RequestParam(value ="RealEstate", required = false) String RealEstate){
		
	

		 System.out.println("i am in viewhomepage"+lang); 
		 System.out.println("i am in viewhomepage"+lname); 
		 System.out.println("i am in viewhomepage"+city);  // languageService
		 //lname = "LN-10410"; //LN-11764 LN-10410
		 
		 if(lang != null && lang !="") {
			 
			 List<Languagedto> getlan = languageService.getLanuage(lang);
			 if (!getlan.isEmpty()) {
				 System.out.println("inside empty");
				 for (int i = 0; i < getlan.size(); i++) {
					 
					 Languagedto Languagedto = getlan.get(i);
					 
					 System.out.println("languate get index"+Languagedto.getLanguage_code()); 
					 System.out.println("languate get index"+Languagedto.getShort_description());
					 lang = Languagedto.getLanguage_code();
					 
				 }
				 
			 }
			 
		 }
		 
		//lang = "ENG";
		
		// city = "Miami"; Phoenix
		 
		// return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchLnLg(lang, lname, city), HttpStatus.OK);
		 
	
		 if(lang !=null && city !=null && lname != null) {
			 System.out.println("Lang & Lname & city");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchLnLg(lang, lname, city), HttpStatus.OK);
			 
		 }else if(lang != null && city !=null) {
			 System.out.println("Lang  & city");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchLgcty(lang,city), HttpStatus.OK); 
			 
		 }else if(lang !=null && lname !=null) {
			 System.out.println("Lang  & lname");
			 return new ResponseEntity<List<arbitdto>>(caseService.Arbitsearchlanguagelname(lang,lname), HttpStatus.OK); 
			 
		 }else if(JudgeApple !=null & JudgeState != null & Accounting != null){
			 System.out.println("JudgeApple && JudgeState & Accounting ");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchJudgeAplSteAndAcc(), HttpStatus.OK); 
		 }else if(JudgeApple !=null & JudgeState != null) {
			 System.out.println("JudgeApple && JudgeState");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchJudgeAppleandState(), HttpStatus.OK);
		 }else if(JudgeApple !=null) {
			 System.out.println("JudgeApple");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchJudgeApple(), HttpStatus.OK);			 
		 }else if(JudgeState != null) {
			 System.out.println("JudgeState");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchJudgeState(), HttpStatus.OK);
			 
		 }else if(Accounting != null) {
			 System.out.println("Accounting");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchAccounting(), HttpStatus.OK);
		 }else if(Construction != null) {
			 System.out.println("Construction");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchConstruction(), HttpStatus.OK);			 
		 }else if(RealEstate != null) {
			 System.out.println("RealEstate");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchRealEstate(), HttpStatus.OK);
			 
		 }else if(lang != null) {			 
			 System.out.println("Lang ");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchLanguage(lang), HttpStatus.OK); 
			 			 
		 }else if(lname != null) {
			 System.out.println("Last name");
			 return new ResponseEntity<List<arbitdto>>(caseService.ArbitsearchLname(lname), HttpStatus.OK); 
			 
		 }else if(city != null) {
			 System.out.println("city");
			 return new ResponseEntity<List<arbitdto>>(caseService.Arbitsearchcity(city), HttpStatus.OK); 
			 
		 }else if(state != null){		
			 
			 System.out.println("state");
			 return new ResponseEntity<List<arbitdto>>(caseService.Arbitsearchstate(state), HttpStatus.OK);
		 } else {
			 System.out.println("full search");
			 return new ResponseEntity<List<arbitdto>>(caseService.arbitratorSearchgetAllResults(), HttpStatus.OK);
			 
		 }
		 
		
	}


	@GetMapping("/search/")
    public List<arbitdto> arbitratorSearch(){
    	
    	return caseService.arbitratorSearchgetAllResults();        
    		
    	}
	@GetMapping("/search2")
	public List<arbitdto> arbitratorSearch2(@RequestParam(value ="page", required = false) String page){
		if(page==null){
			page="0";
		}
		return caseService.arbitratorSearchgetAllResults2(Integer.parseInt(page));

	}
   
    /**
    
    @GetMapping("/search/multisearch")
	public ResponseEntity<List<arbitdto>> getArbitratorSearchResults(@RequestParam String lang, 
			@RequestParam String lname )//@RequestParam String lname
				 {
		return new ResponseEntity<List<arbitdto>>(caseService.arbitratorSearch(lang, lname), HttpStatus.OK);
	}
     */
    
    @PostMapping("/submitRating")
    public ResponseEntity<List<SubmitRatingdto>> SubmitRating(@RequestParam String rating, @RequestParam String comments)
    //public String SubmitRating(@RequestParam String rating, @RequestParam String comments) {
    {
    	long rid = 232323;
    	SubmitRatingdto SubmitRatingdto = new SubmitRatingdto();
    	SubmitRatingdto.setNeutral_id("10103");
    	SubmitRatingdto.setIp_Address("192.203.255.20");
    	SubmitRatingdto.setRating_Comment(comments);
    	SubmitRatingdto.setStar_Rating_Value(rating);
    	//SubmitRatingdto.setRating_id(rid);
    	
    	submitRatingRepository.save(SubmitRatingdto);
    	return null;
    }
    
    @GetMapping("/profile/multisearch")
   	public ResponseEntity<List<Profiledto>> getProfileSearchResults(@RequestParam int contact_id 
   			 )
   				 {
   		return new ResponseEntity<List<Profiledto>>(profileService.profileSearch(contact_id), HttpStatus.OK);
   	}
    
    @GetMapping("/profile/compensation/search")
    public ResponseEntity<List<Compensationdto>>getProfileCompensationSearch(@RequestParam int contact_id){
    	
    	return new ResponseEntity<List<Compensationdto>>(compensationService.compensationSearch(contact_id), HttpStatus.OK);
    }
    
    @GetMapping("/profile/multisearch/image")
    public ResponseEntity<List<Imagedto>>getImage(@RequestParam int contact_id){
    	 System.out.println("image");
    	return new ResponseEntity<List<Imagedto>>(ArbitratorImageService.arbitratorgetImage(contact_id), HttpStatus.OK);
    }
    
    //
   /** 
    @GetMapping("/blog/{id}")

    public ModelAndView showContent(@PathVariable(value = "contact_id") int contact_id, Model model) throws 
    UnsupportedEncodingException {

   
    List<Imagedto> post = ArbitratorImageService.arbitratorgetImage(contact_id);
    ArrayList<Imagedto> content = new ArrayList<>();
    post.forEach(content::add);
    model.addAttribute("post", content);

   // byte[] encodeBase641 = Base64.getEncoder().encode(ArbitratorImageService.arbitratorgetImage(contact_id));
    byte[] encodeBase64 = Base64.getEncoder().encode(post.get().getImage());
    String base64Encoded = new String(encodeBase64, "UTF-8");
    model.addAttribute("contentImage", base64Encoded );

    ModelAndView modelAndView = new ModelAndView("view");
    modelAndView.addObject("contentImage",base64Encoded );
    return modelAndView;

    }
    
    
}
    
   */ 
   
}
