package com.demo.one2one.bi;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


public class Employee {
	
	private int empId;
	private String empName;

	
	private Parking parking;

	public Employee(String empName) {
		this.empName = empName;
	}
}
