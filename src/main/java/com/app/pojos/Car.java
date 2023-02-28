package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;



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
public class Car extends BaseEntity {
@Column(length=40)
	private String name;
@Column(length=40)
	private String brand;
@Column(name="veh_reg_num")
private String vehicleRegistrationNumber;

}
