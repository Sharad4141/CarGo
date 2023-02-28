package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repository.RideRepository;

public class RideServiceImpl implements RideService {
	@Autowired
	private RideRepository riderepo;

}
