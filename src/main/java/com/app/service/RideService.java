package com.app.service;

import com.app.dto.RideDto;
import com.app.enums.PaymentType;
import com.app.pojos.Ride;

public interface RideService {
	public Ride createARide(Long pid,Long did ,RideDto ridedto,PaymentType ptype);
	public Ride addPassengerToRide(Long pid,Long Rid);
}
