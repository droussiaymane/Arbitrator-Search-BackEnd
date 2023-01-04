package com.aaa.arbitrator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profiledto {
	@Id
	private String section_position;
	public String getSection_position() {
		return section_position;
	}
	public void setSection_position(String section_position) {
		this.section_position = section_position;
	}
	private String section_name; 
	private String section_text;
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public String getSection_text() {
		return section_text;
	}
	public void setSection_text(String section_text) {
		this.section_text = section_text;
	}

}
