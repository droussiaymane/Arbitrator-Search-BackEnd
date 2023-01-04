package com.aaa.arbitrator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aaa.arbitrator.model.Compensationdto;

public interface CompensationRepository extends  JpaRepository<Compensationdto,String>{
	
	@Query(value = " select Neutral_Contactid, \r\n"
			+ "                       Neutral_Role_Code, \r\n"
			+ "                       HEARING_AMT_DURATION_CODE, \r\n"
			+ "                       HEARING_RATE , \r\n"
			+ "                       STUDY_RATE, \r\n"
			+ "                       TRAVEL_RATE, \r\n"
			+ "                       CANCELLATION_RATE, \r\n"
			+ "                       CANCELLATION_PERIOD, \r\n"
			+ "                       RATE_COMMENTS from          \r\n"
			+ "       (Select Neutral_Contactid, \r\n"
			+ "                       Neutral_Role_Code, \r\n"
			+ "                       HEARING_AMT_DURATION_CODE, \r\n"
			+ "                       HEARING_RATE , \r\n"
			+ "                       STUDY_RATE, \r\n"
			+ "                       TRAVEL_RATE, \r\n"
			+ "                       CANCELLATION_RATE, \r\n"
			+ "                       CANCELLATION_PERIOD, \r\n"
			+ "                       RATE_COMMENTS, \r\n"
			+ "                       row_Number() over (partition by neutral_contactID order by neutral_role_code desc, HEARING_AMT_DURATION_CODE ASC) row_to_pick \r\n"
			+ "       From (Select Ncr.Contact_Id \r\n"
			+ "       neutral_contactID, ncr.neutral_role_code,NCR.HEARING_AMT_DURATION_CODE, nvl(ncr.DISPUTE_TYPE_CODE,0),nvl(NCR.DISPUTE_SUB_TYPE_CODE,0),nvl(NCR.NEUTRAL_ROLE_CODE,0), \r\n"
			+ "       (CASE nvl(NCR.HEARING_AMT,-1) WHEN -1 THEN NCR.HEARING_AMT_DURATION_CODE ELSE \r\n"
			+ "       '$'||NCR.HEARING_AMT||'.00/'||decode(NCR.HEARING_AMT_DURATION_CODE,'HOUR','Hr',INITCAP(NCR.HEARING_AMT_DURATION_CODE)) \r\n"
			+ "       END) HEARING_RATE, \r\n"
			+ "                    (CASE nvl(NCR.STUDY_AMT,-1) WHEN -1 THEN NCR.STUDY_AMT_DURATION_CODE ELSE \r\n"
			+ "       '$'||NCR.STUDY_AMT||'.00/'||decode(NCR.STUDY_AMT_DURATION_CODE,'HOUR','Hr',INITCAP(NCR.STUDY_AMT_DURATION_CODE)) \r\n"
			+ "       END) STUDY_RATE, \r\n"
			+ "                    (CASE nvl(NCR.TRAVEL_AMT,-1) WHEN -1 THEN NCR.TRAVEL_AMT_DURATION_CODE ELSE \r\n"
			+ "       '$'||NCR.TRAVEL_AMT||'.00/'||decode(NCR.TRAVEL_AMT_DURATION_CODE,'HOUR','Hr',INITCAP(NCR.TRAVEL_AMT_DURATION_CODE)) \r\n"
			+ "       END) TRAVEL_RATE, \r\n"
			+ "                    (CASE NVL(NCR.CANCELLATION_AMT,-1) WHEN -1 THEN NCR.CANCELLATION_AMT_DURATION_CODE ELSE \r\n"
			+ "       '$'||NCR.CANCELLATION_AMT||'.00/'||decode(NCR.CANCELLATION_AMT_DURATION_CODE,'HOUR','Hr',INITCAP(NCR.CANCELLATION_AMT_DURATION_CODE)) \r\n"
			+ "       END) CANCELLATION_RATE, \r\n"
			+ "            nvl(ncr.cancelation_no_penalty_days,0)||' Days' CANCELLATION_PERIOD, \r\n"
			+ "            ncr.rate_comment RATE_COMMENTS \r\n"
			+ "       FROM  NEUTRAL_COMPENSATION_RATES NCR \r\n"
			+ "       Where 1=1 \r\n"
			+ "       And Status='A' \r\n"
			+ "       and neutral_role_code IS NULL  \r\n"
			+ "       Union \r\n"
			+ "       Select Ncr.Contact_Id \r\n"
			+ "       neutral_contactID, ncr.neutral_role_code, NCR.HEARING_AMT_DURATION_CODE, nvl(ncr.DISPUTE_TYPE_CODE,0),nvl(NCR.DISPUTE_SUB_TYPE_CODE,0),nvl(NCR.NEUTRAL_ROLE_CODE,0), \r\n"
			+ "       (CASE nvl(NCR.HEARING_AMT,-1) WHEN -1 THEN NCR.HEARING_AMT_DURATION_CODE ELSE \r\n"
			+ "       '$'||NCR.HEARING_AMT||'.00/'||decode(NCR.HEARING_AMT_DURATION_CODE,'HOUR','Hr',INITCAP(NCR.HEARING_AMT_DURATION_CODE)) \r\n"
			+ "       END) HEARING_RATE, \r\n"
			+ "                    (CASE nvl(NCR.STUDY_AMT,-1) WHEN -1 THEN NCR.STUDY_AMT_DURATION_CODE ELSE \r\n"
			+ "       '$'||NCR.STUDY_AMT||'.00/'||decode(NCR.STUDY_AMT_DURATION_CODE,'HOUR','Hr',INITCAP(NCR.STUDY_AMT_DURATION_CODE)) \r\n"
			+ "       END) STUDY_RATE, \r\n"
			+ "                    (CASE nvl(NCR.TRAVEL_AMT,-1) WHEN -1 THEN NCR.TRAVEL_AMT_DURATION_CODE ELSE \r\n"
			+ "       '$'||NCR.TRAVEL_AMT||'.00/'||decode(NCR.TRAVEL_AMT_DURATION_CODE,'HOUR','Hr',INITCAP(NCR.TRAVEL_AMT_DURATION_CODE)) \r\n"
			+ "       END) TRAVEL_RATE, \r\n"
			+ "                    (CASE NVL(NCR.CANCELLATION_AMT,-1) WHEN -1 THEN NCR.CANCELLATION_AMT_DURATION_CODE ELSE \r\n"
			+ "       '$'||NCR.CANCELLATION_AMT||'.00/'||decode(NCR.CANCELLATION_AMT_DURATION_CODE,'HOUR','Hr',INITCAP(NCR.CANCELLATION_AMT_DURATION_CODE)) \r\n"
			+ "       END) CANCELLATION_RATE, \r\n"
			+ "            nvl(ncr.cancelation_no_penalty_days,0)||' Days' CANCELLATION_PERIOD, \r\n"
			+ "            ncr.rate_comment RATE_COMMENTS \r\n"
			+ "       FROM  NEUTRAL_COMPENSATION_RATES NCR \r\n"
			+ "       Where 1=1 \r\n"
			+ "       And Status='A' \r\n"
			+ "       and neutral_role_code IS NULL        \r\n"
			+ "       Order By 3 ,4 ,5)  )\r\n"
			+ "       where Neutral_Contactid=:contact_id ", nativeQuery = true)
			List<Compensationdto> compensationSearch(int contact_id);

}
