package com.aaa.arbitrator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aaa.arbitrator.model.Profiledto;


public interface ProfileRepository extends  JpaRepository<Profiledto, String> {

	@Query(value = " select distinct section.section_name, text.section_text, section.resume_bio_section_id, defn.section_position\r\n"
			+ "        from  xref_neutral_resume_formats neutral_format, \r\n"
			+ "        xref_resume_format_defn defn,  \r\n"
			+ "        xref_neutral_section_texts text,   resume_bio_section section,  \r\n"
			+ "        resume_format format\r\n"
			+ "        where neutral_format.resume_format_id = defn.resume_format_id  \r\n"
			+ "        and neutral_format.contact_id = text.contact_id  \r\n"
			+ "        and defn.resume_bio_section_id = text.resume_bio_section_id \r\n"
			+ "        and defn.resume_bio_section_id = section.resume_bio_section_id\r\n"
			+ "        and neutral_format.resume_format_id = format.resume_format_id\r\n"
			+ "        and neutral_format.status = 'A' \r\n"
			+ "        and defn.status = 'A' \r\n"
			+ "        and text.status = 'A' \r\n"
			+ "        and section.status = 'A'\r\n"
			+ "        and format.status = 'A'\r\n"
			+ "        and TEXT.RESUME_BIO_SECTION_ID <> 87\r\n"
			+ "        and neutral_format.contact_id = neutral_format.contact_id\r\n"
			+ "        and format.resume_format_name = 'ARB'        \r\n"
			+ "        and text.contact_id = :contact_id", nativeQuery=true)
			List<Profiledto> profileSearch(int contact_id);
}
