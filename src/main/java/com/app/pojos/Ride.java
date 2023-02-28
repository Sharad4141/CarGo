package com.app.pojos;

import java.time.LocalDateTime;

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
@Embedded
private  Location startLocation;
@Embedded
private  Location endLocation;
@Embedded
private Location currentLocation;
@Enumerated(EnumType.STRING)
private Status status;
@Embedded
private Fare fare;


}
