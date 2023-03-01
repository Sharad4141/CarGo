package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

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
public class Passenger extends User{

	@OneToMany
    @JoinColumn(name="fk_dratings")
    private List<Feedback> feedbacks = new ArrayList<Feedback>();
	@ManyToMany
    @JoinTable(name = "passenger_rides",
           joinColumns =  @JoinColumn(name = "fk_passenger") ,
           inverseJoinColumns =  @JoinColumn(name = "fk_pride") )
    private Set<Ride> passengerrides = new HashSet<Ride>();
	public List<Feedback> getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(List<Feedback> feedbacks) {
		this.feedbacks = feedbacks;
	}
	public Set<Ride> getPassengerrides() {
		return passengerrides;
	}
	public void setPassengerrides(Set<Ride> passengerrides) {
		this.passengerrides = passengerrides;
	}
	
		
	
	
}
