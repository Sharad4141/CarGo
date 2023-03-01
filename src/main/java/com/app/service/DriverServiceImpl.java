package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Driver;
import com.app.repository.DriverRepository;

public class DriverServiceImpl  implements DriverService{

	@Autowired
	private DriverRepository driverrepo;
	public Driver FindDriverById(Long id) {
		return driverrepo.findById(id).orElseThrow();
	}
}
