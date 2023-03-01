package com.app.service;

import java.time.LocalDateTime;
import javax.validation.constraints.FutureOrPresent;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RideDto {
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@FutureOrPresent
	private LocalDateTime startDateTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@FutureOrPresent
	private LocalDateTime endDateTime;
//@Embedded
//private  Location startLocation;
//@Embedded
//private  Location endLocation;
//@Embedded
//private Location currentLocation;
	private Double strtLocnLongitude;
	private Double strtLocnLatitude;

	private Double endLocnLongitude;
	private Double endLocnLatitude;
	// private Double currentLocnLongitude;
	// private Double currentLocnLatitude;
}
