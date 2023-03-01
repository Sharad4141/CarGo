package com.app.service;

import java.util.List;

import com.app.pojos.Driver;

public interface DriverService {

	List<Driver> getAllDrivers();

	void deleteDriver(Long did);

}
