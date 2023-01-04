package com.aaa.arbitrator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aaa.arbitrator.model.Languagedto;
//import com.aaa.arbitrator.model.arbitdto;

public interface LanguageRepository extends  JpaRepository<Languagedto, String> {
	
	@Query(value = " select distinct code.short_description,lang.language_code \r\n"
			+ "from   neutral_languages lang,   code_values code \r\n"
			+ "where lang.language_ind_code = code.code_type_code \r\n"
			+ "and lang.language_code = code.value \r\n"
			+ "and lang.status = 'A' \r\n"
			+ "and code.status = 'A'\r\n"
			+ "and code.short_description like :language_name", nativeQuery = true) //last_name,language_name
    List<Languagedto> getLanuage(String language_name);

}
