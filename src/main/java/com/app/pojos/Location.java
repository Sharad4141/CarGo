package com.app.pojos;

import javax.persistence.Embeddable;

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
public class Location {
	//private int  long_deg;
	//private int long;
	private Double  longitude ;
	//private int  lat_deg;
	//private int lat_min;
	private Double  latitude;
}
