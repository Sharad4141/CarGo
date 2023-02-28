package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Passenger;
import com.app.repository.PassengerRepository;

public class PassengerServiceImpl implements PassengerService{
	@Autowired
	private PassengerRepository passengerrepo;
}
