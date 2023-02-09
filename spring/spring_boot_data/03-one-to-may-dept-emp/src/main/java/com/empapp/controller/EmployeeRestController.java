package com.empapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dto.EmployeeRequest;
import com.empapp.entity.Employee;
import com.empapp.repo.EmployeeRepo;

@RestController
@RequestMapping(path = "api")
public class EmployeeRestController {

	private EmployeeRepo empRepo;

	@Autowired
	public EmployeeRestController(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	@GetMapping(path = "employee",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmps(){
		return empRepo.findAll();
	}
	@GetMapping(path = "selectedemployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getSelectedEmp(@RequestBody EmployeeRequest employeeRequest) {
		List<Employee>employees=empRepo.findEmployeessByIds(employeeRequest.getIds());
		return employees;
	}
}
