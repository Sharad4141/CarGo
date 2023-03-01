package com.app.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.enums.PaymentType;
import com.app.enums.Status;
import com.app.pojos.Driver;
import com.app.pojos.Fare;
import com.app.pojos.Location;
import com.app.pojos.Passenger;
import com.app.pojos.Ride;
import com.app.repository.DriverRepository;
import com.app.repository.PassengerRepository;
import com.app.repository.RideRepository;

public class RideServiceImpl implements RideService {
	@Autowired
	private RideRepository riderepo;
	private PassengerRepository passengerrepo;
	private DriverRepository driverrepo;
	@Override
	public Ride createARide(Long pid,Long did ,RideDto ridedto,PaymentType ptype) {
	
		Passenger passenger=passengerrepo.findById(pid).orElseThrow();
		Driver driver=driverrepo.findById(did).orElseThrow();
		Set<Passenger> passengers= new HashSet<Passenger>();
		passengers.add(passenger);
		Fare fare=new Fare();
		fare.setPaymentType(ptype);
		
		Ride ride =new Ride(ridedto.getStartDateTime(),ridedto.getEndDateTime()
				,ridedto.getStrtLocnLongitude(),ridedto.getStrtLocnLatitude()
				,ridedto.getEndLocnLongitude(),ridedto.getEndLocnLatitude()
				,ridedto.getStrtLocnLongitude(),ridedto.getStrtLocnLatitude()
				,Status.UPCOMING,fare,passengers,driver);
		
		fare.setAmount(ride.calcFare());
		
		return ride ;
	}
	@Override
	public Ride addPassengerToRide(Long pid,Long Rid) {
		Ride ride =riderepo.findById(Rid).orElseThrow();
		Passenger passenger=passengerrepo.findById(pid).orElseThrow()	;	
		ride.getPassengers().add(passenger);
				return ride;
	}

}
