package com.app.pojos;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.format.annotation.DateTimeFormat;

import com.app.enums.Status;
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
public class Ride extends BaseEntity {
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name="start_date_time")
private  LocalDateTime startDateTime; 
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name="end_date_time")
private  LocalDateTime endDateTime;
//@Embedded
//private  Location startLocation;
//@Embedded
//private  Location endLocation;
//@Embedded
//private Location currentLocation;
	private Double strtLocnLongitude;
	private Double strtLocnLatitude;

	private Double endLocnLongitude;
	private Double endtLocnLatitude;
	private Double currentLocnLongitude;
	private Double currentLocnLatitude;
@Enumerated(EnumType.STRING)
private Status status;
@Embedded
private Fare fare;
@ManyToMany(mappedBy="passengerrides")
private Set<Passenger> passengers;//= new HashSet<Passenger>()
@ManyToOne
@JoinColumn(name = "fk_driver")
private Driver driver ;
public double calculateDist() {
	return 5.0;
}
public Double calcFare() {
	return this.calculateDist()*7;
}

}
