package com.app.pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.*;

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
@ToString
public class Feedback extends BaseEntity {
	@Min(value = 1, message = "Rating should not  be less than 1")
	@Max(value = 5, message = "Salary should not be greater than 5")
private int drivingRating;
	@Min(value = 1, message = "Rating should not  be less than 1")
	@Max(value = 5, message = "Salary should not be greater than 5")
private int punctualityRating;
	@Column(length=100)
private String complaint;
	
}
