package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.*;

import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.format.annotation.DateTimeFormat;

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
@ToString(exclude = "password") // possible bug
public class Driver extends User {
	private long aadharId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	@ReadOnlyProperty
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="date_of_joining")
	private LocalDate dateOfJoining;
	@Min(value = 1, message = "Rating should not  be less than 1")
	@Max(value = 5, message = "Salary should not be greater than 5")
	private int rating;
	@Embedded
	private DriversLicense driverslicense;
	@OneToOne
	@JoinColumn(name = "car_id")
	private Car car;
	@OneToMany
    @JoinColumn(name ="fk_cfeedback")
    private List<Feedback> items = new ArrayList<Feedback>();

}
