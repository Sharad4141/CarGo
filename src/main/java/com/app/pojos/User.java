package com.app.pojos;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


import com.app.enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class User extends BaseEntity{
	@Column(nullable = false,length=25)
private String firstName;
	@Column(length=30)
private String lastName;
	@Column(unique = true)
	@Email(message="invalid email id")
private String email;
	@Column(length=350)
	@JsonIgnore
private String password;
	@Column(length=10)
	@Enumerated(EnumType.STRING)
private Gender gender;
	@Column(name="mob_num")
private long mobileNumber;
@Embedded
private Location location;
}
