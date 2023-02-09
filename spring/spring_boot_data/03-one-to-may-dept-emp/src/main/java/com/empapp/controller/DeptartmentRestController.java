package com.empapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.dto.EmpDeptResponse;
import com.empapp.entity.Department;
import com.empapp.entity.Employee;
import com.empapp.repo.DepartmentRepo;
import com.empapp.repo.EmployeeRepo;

@RestController
@RequestMapping(path = "api")
public class DeptartmentRestController {

	private DepartmentRepo deptRepo;
	
	private EmployeeRepo empRepo;

	@Autowired
	public DeptartmentRestController(DepartmentRepo deptRepo, EmployeeRepo empRepo) {
		this.deptRepo = deptRepo;
		this.empRepo = empRepo;
	}

	@GetMapping(path = "department",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Department> getAllEmps(){
		return deptRepo.findAll();
	}

	@GetMapping(path = "deptmentemp",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmpDeptResponse> getAllDeptWithEmplInformation(){
		return deptRepo.getEmpDeptInformation();
	}
}
