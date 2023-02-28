package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
