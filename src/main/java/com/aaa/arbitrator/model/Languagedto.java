package com.aaa.arbitrator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Languagedto {
	
	@Id
	private String short_description;
    public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public String getLanguage_code() {
		return language_code;
	}
	public void setLanguage_code(String language_code) {
		this.language_code = language_code;
	}
	private String language_code;

}
