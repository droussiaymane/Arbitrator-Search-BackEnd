package com.aaa.arbitrator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="submit_rating_poc") //SEARCH_ANALYTICS_RATING_PANEL
public class SubmitRatingdto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Rating_id;
	public Long getRating_id() {
		return Rating_id;
	}
	public void setRating_id(Long rating_id) {
		Rating_id = rating_id;
	}
	public String getRating_search_type() {
		return Rating_search_type;
	}
	public void setRating_search_type(String rating_search_type) {
		Rating_search_type = rating_search_type;
	}
	public String getIp_Address() {
		return Ip_Address;
	}
	public void setIp_Address(String ip_Address) {
		Ip_Address = ip_Address;
	}
	public String getNeutral_id() {
		return Neutral_id;
	}
	public void setNeutral_id(String neutral_id) {
		Neutral_id = neutral_id;
	}
	public String getStar_Rating_Value() {
		return Star_Rating_Value;
	}
	public void setStar_Rating_Value(String star_Rating_Value) {
		Star_Rating_Value = star_Rating_Value;
	}
	public String getRating_Comment() {
		return Rating_Comment;
	}
	public void setRating_Comment(String rating_Comment) {
		Rating_Comment = rating_Comment;
	}
	private String Rating_search_type;
	private String Ip_Address;
	private String Neutral_id;
	private String Star_Rating_Value;
	private String Rating_Comment;

}
