package com.app.dto;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.app.enums.Gender;
import com.app.pojos.Location;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class PassengerDto {
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	@NotEmpty(message = "First name must be supplied")
	@Length(min = 4, max = 30, message = "Invalid First name length")
	private String firstName;
	@NotBlank(message = "Last name must be supplied")
private String lastName;
@NotBlank
@Email(message = "Invalid Email")	
private String email;
@JsonProperty(access = Access.WRITE_ONLY)
private String password;
@NotEmpty(message = "gender  must be selected")
private Gender gender;
@Digits(message = "Number should contain 10 digits.", fraction = 0, integer = 10)
private long mobileNumber;

private Location location;
	
}
