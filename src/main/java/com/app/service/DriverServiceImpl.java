package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Driver;
import com.app.repository.DriverRepository;

public class DriverServiceImpl  implements DriverService{

	@Autowired
	private DriverRepository driverrepo;

	@Override
	public List<Driver> getAllDrivers() {
		
		return driverrepo.findAll();
	}

	@Override
	public void deleteDriver(Long did) {
		Driver d=driverrepo.findById(did).orElseThrow();
		driverrepo.delete(d);
		
	}
}
