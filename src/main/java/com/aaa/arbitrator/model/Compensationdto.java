package com.aaa.arbitrator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Compensationdto {
	
	@Id
	private String Neutral_Contactid;                        
	private String HEARING_RATE;
	private String STUDY_RATE; 
	private String TRAVEL_RATE; 
	private String CANCELLATION_RATE; 
	private String CANCELLATION_PERIOD;
	public String getNeutral_Contactid() {
		return Neutral_Contactid;
	}
	public void setNeutral_Contactid(String neutral_Contactid) {
		Neutral_Contactid = neutral_Contactid;
	}
	public String getHEARING_RATE() {
		return HEARING_RATE;
	}
	public void setHEARING_RATE(String hEARING_RATE) {
		HEARING_RATE = hEARING_RATE;
	}
	public String getSTUDY_RATE() {
		return STUDY_RATE;
	}
	public void setSTUDY_RATE(String sTUDY_RATE) {
		STUDY_RATE = sTUDY_RATE;
	}
	public String getTRAVEL_RATE() {
		return TRAVEL_RATE;
	}
	public void setTRAVEL_RATE(String tRAVEL_RATE) {
		TRAVEL_RATE = tRAVEL_RATE;
	}
	public String getCANCELLATION_RATE() {
		return CANCELLATION_RATE;
	}
	public void setCANCELLATION_RATE(String cANCELLATION_RATE) {
		CANCELLATION_RATE = cANCELLATION_RATE;
	}
	public String getCANCELLATION_PERIOD() {
		return CANCELLATION_PERIOD;
	}
	public void setCANCELLATION_PERIOD(String cANCELLATION_PERIOD) {
		CANCELLATION_PERIOD = cANCELLATION_PERIOD;
	}
	public String getRATE_COMMENTS() {
		return RATE_COMMENTS;
	}
	public void setRATE_COMMENTS(String rATE_COMMENTS) {
		RATE_COMMENTS = rATE_COMMENTS;
	}
	private String RATE_COMMENTS;

}
