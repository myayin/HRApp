package com.example.HRApp.Dto;

import com.example.HRApp.lib.dto.ApplicantDto;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;
import java.io.IOException;
import java.text.ParseException;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
@RunWith(SpringRunner.class)

class ApplicantControllerTest {

	@Autowired
	private JacksonTester<ApplicantDto> json;

	private static final String NAME = "name";
	private static final String PHONE = "0(541) 562 53 44";
	private static final String EMAIL = "email@email.com";
	private static final String ADDRESS = "Address";
	private static final String  THOUGHT = "Thoughts";

	private static final String JSON_TO_DESARILIZE =
			"{\"name\":\"" +
					NAME +
					"\",\"phone\":\"" +
					PHONE +
					"\",\"email\":\"" +
					EMAIL +
					"\",\"address\":\"" +
					ADDRESS +
					"\",\"thoughts\":" +
					THOUGHT +
					"}";

	ApplicantDto applicantDto = new ApplicantDto(NAME, PHONE, EMAIL, ADDRESS, THOUGHT);;


   @Test
	public void firstNameSeializes() throws IOException{
   	assertThat(this.json.write(applicantDto))
	.extractingJsonPathStringValue("@.name")
	.isEqualTo(NAME);

   }

	@Test
	public void phoneSeializes() throws IOException{
		assertThat(this.json.write(applicantDto))
				.extractingJsonPathStringValue("@.phone")
				.isEqualTo(PHONE);

	}
	@Test
	public void emailSeializes() throws IOException{
		assertThat(this.json.write(applicantDto))
				.extractingJsonPathStringValue("@.email")
				.isEqualTo(EMAIL);

	}

	@Test
	public void addressSeializes() throws IOException{
		assertThat(this.json.write(applicantDto))
				.extractingJsonPathStringValue("@.address")
				.isEqualTo(ADDRESS);

	}

	@Test
	public void thoughtSeializes() throws IOException{
		assertThat(this.json.write(applicantDto))
				.extractingJsonPathStringValue("@.thoughts")
				.isEqualTo(THOUGHT);

	}
}
