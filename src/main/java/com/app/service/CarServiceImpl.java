package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Car;
import com.app.repository.CarRepository;

public class CarServiceImpl implements CarService {
	@Autowired
	private CarRepository carrepo;
	public Car addCar(Car car) {
		return carrepo.save(car);
	}

 
}
