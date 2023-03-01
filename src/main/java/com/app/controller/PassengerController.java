package com.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.PassengerDto;

@RestController
@RequestMapping("/api/passenger")
public class PassengerController {
	public ResponseEntity<?> addNewPassenger (PassengerDto passengerdto){
		
		return null;
	}

}
