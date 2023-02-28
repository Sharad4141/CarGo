package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Embeddable
public class DriversLicense {
private String driversLicenseNo;
@DateTimeFormat(pattern = "yyyy-MM-dd")
@ReadOnlyProperty
@Column(name="date_of_issue")
private LocalDate dateOfIssue;

@DateTimeFormat(pattern = "yyyy-MM-dd")
@ReadOnlyProperty
@Column(name="valid_till_date")
private LocalDate validTillDate;

}

