package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Admin;
import com.app.pojos.Driver;
import com.app.pojos.Passenger;
import com.app.service.AdminService;
import com.app.service.DriverService;
import com.app.service.PassengerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private PassengerService passengerService;

	@Autowired
	private DriverService driverService;

	public AdminController() {

	}

	@PostMapping
	public ResponseEntity<?> saveAdmin(@RequestBody Admin admin) {
		return new ResponseEntity<>(adminService.addNewAdmin(admin), HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<?> getPassengers() {
		List<Passenger> passengers = passengerService.getAllPassengers();
		return new ResponseEntity<>(passengers, HttpStatus.OK);

	}

	@GetMapping
	public ResponseEntity<?> getDrivers() {
		List<Driver> drivers = driverService.getAllDrivers();
		return new ResponseEntity<>(drivers, HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<?> removePassenger(Long pid) {
		passengerService.deletePassenger(pid);
		return new ResponseEntity<>("passenger removed", HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<?> removeDriver(Long did) {
		driverService.deleteDriver(did);
		return new ResponseEntity<>("Driver removed", HttpStatus.OK);
	}


}
