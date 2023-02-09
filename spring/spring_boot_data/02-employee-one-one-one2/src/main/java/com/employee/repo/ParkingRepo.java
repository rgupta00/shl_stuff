package com.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entities.Parking;

@Repository
public interface ParkingRepo extends JpaRepository<Parking, Integer> {
}
