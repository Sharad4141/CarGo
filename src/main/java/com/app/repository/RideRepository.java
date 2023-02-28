package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Ride;

public interface RideRepository extends JpaRepository<Ride, Long>{

}
