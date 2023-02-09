package com.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entities.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	// :) all crud methods would be provide by spring data : love it
}
