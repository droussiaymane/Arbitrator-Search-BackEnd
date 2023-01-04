package com.aaa.arbitrator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

//import javax.persistence.Entity; 

@Entity
@Table(name="imagedto")
public class Imagedto {
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long contact_id;
	
	@Lob
	private byte[] image_file_loc;

	public Long getContact_id() {
		return contact_id;
	}

	public void setContact_id(Long contact_id) {
		this.contact_id = contact_id;
	}

	public byte[] getImage_file_loc() {
		return image_file_loc;
	}

	public void setImage_file_loc(byte[] image_file_loc) {
		this.image_file_loc = image_file_loc;
	}
}
