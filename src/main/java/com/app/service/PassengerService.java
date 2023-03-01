package com.app.service;

import java.util.List;

import com.app.pojos.Passenger;

public interface PassengerService {

	List<Passenger> getAllPassengers();

	void  deletePassenger(Long pid) ;
		
}
