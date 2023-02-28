package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.repository.DriverRepository;

public class DriverServiceImpl  implements DriverService{

	@Autowired
	private DriverRepository Driverrepo;
}
