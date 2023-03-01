package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Passenger;
import com.app.repository.PassengerRepository;

public class PassengerServiceImpl implements PassengerService{
	@Autowired
	private PassengerRepository passengerrepo;

	@Override
	public List<Passenger> getAllPassengers() {
		
		return passengerrepo.findAll();
	}

	@Override
	public void deletePassenger(Long pid) {
		Passenger p=passengerrepo.findById(pid).orElseThrow();
		 passengerrepo.delete(p);
	}
	
}
