package com.aaa.arbitrator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class arbitdto {
	
	@Id
	private String contact_id;
    private String neutral_id;
    private String attorney_flag;
    private String first_name;
    private String middle_name;
    private String lastName;
    private String personal_suffix_code;
    private String profession_suffix_code;
    private String city;
    private String state_code;
    private String country_code;
    private String zip_code;
    private String country_name;
    private String hearing_rate;
    private String study_rate;
    private String travel_rate;
    private String cancellation_rate;
    private String cancellation_period;
    private String rate_comments;
    private String neutral_role_code;

	@Column
    private String languageName;
    
    
	public String getContact_id() {
		return contact_id;
	}
	public void setContact_id(String contact_id) {
		this.contact_id = contact_id;
	}
	public String getNeutral_id() {
		return neutral_id;
	}
	public void setNeutral_id(String neutral_id) {
		this.neutral_id = neutral_id;
	}
	public String getAttorney_flag() {
		return attorney_flag;
	}
	public void setAttorney_flag(String attorney_flag) {
		this.attorney_flag = attorney_flag;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getPersonal_suffix_code() {
		return personal_suffix_code;
	}
	public void setPersonal_suffix_code(String personal_suffix_code) {
		this.personal_suffix_code = personal_suffix_code;
	}
	public String getProfession_suffix_code() {
		return profession_suffix_code;
	}
	public void setProfession_suffix_code(String profession_suffix_code) {
		this.profession_suffix_code = profession_suffix_code;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getHearing_rate() {
		return hearing_rate;
	}
	public void setHearing_rate(String hearing_rate) {
		this.hearing_rate = hearing_rate;
	}
	public String getStudy_rate() {
		return study_rate;
	}
	public void setStudy_rate(String study_rate) {
		this.study_rate = study_rate;
	}
	public String getTravel_rate() {
		return travel_rate;
	}
	public void setTravel_rate(String travel_rate) {
		this.travel_rate = travel_rate;
	}
	public String getCancellation_rate() {
		return cancellation_rate;
	}
	public void setCancellation_rate(String cancellation_rate) {
		this.cancellation_rate = cancellation_rate;
	}
	public String getCancellation_period() {
		return cancellation_period;
	}
	public void setCancellation_period(String cancellation_period) {
		this.cancellation_period = cancellation_period;
	}
	public String getRate_comments() {
		return rate_comments;
	}
	public void setRate_comments(String rate_comments) {
		this.rate_comments = rate_comments;
	}
	public String getNeutral_role_code() {
		return neutral_role_code;
	}
	public void setNeutral_role_code(String neutral_role_code) {
		this.neutral_role_code = neutral_role_code;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
}
