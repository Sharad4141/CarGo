package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Car;

public interface CarRepository  extends JpaRepository<Car, Long>{

}
