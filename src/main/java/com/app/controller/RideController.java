package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.enums.PaymentType;
import com.app.pojos.Driver;
import com.app.pojos.Location;
import com.app.pojos.Passenger;
import com.app.service.RideDto;
import com.app.service.RideService;

@RestController
@RequestMapping("/api/ride")
public class RideController {
	RideService rideservice;
	public ResponseEntity<?> bookARide(Long pid,Long did,RideDto ridedto,PaymentType ptype){
		rideservice.createARide(pid, did, ridedto, ptype);
		return null;
		}
	public ResponseEntity<?> addPassengerToRide(Long pid,Long rid){
		rideservice.addPassengerToRide(pid, rid);
		return null;
	}

}
