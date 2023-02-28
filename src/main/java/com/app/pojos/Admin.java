package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


import com.app.enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class Admin {
	@Column(nullable = false,length=40)
	private String firstName;
	@Column(length=40)
	private String lastName;
	@Column(unique = true)
	@Email(message="invalid email id")
	private String email;
	@Column(length=350)
	@JsonIgnore
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(length=30)
	private Gender gender;
	
	private long mobileNumber;
	
	
}

