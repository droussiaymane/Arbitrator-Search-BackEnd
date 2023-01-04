package com.aaa.arbitrator.repository;

import org.springframework.stereotype.Repository;
import com.aaa.arbitrator.model.Imagedto;
//import com.aaa.arbitrator.model.arbitdto; 21265

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArbitratorImage extends JpaRepository<Imagedto, String> {
	
	@Query(value = " select contact_id,image_file_loc \r\n"
			+ " from  neutral_images \r\n"
			+ " where  IMAGE_TYPE ='I'\r\n"
			+ " and contact_id = :contact_id ", nativeQuery=true)
	List<Imagedto> arbitratorgetImage(int contact_id);

}
