package com.empapp.dto;
//com.empapp.dto.EmpDeptResponse
public class EmpDeptResponse {
	private String dname;
	private String name;
	private double salary;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmpDeptResponse() {}
	public EmpDeptResponse(String dname, String name, double salary) {
		this.dname = dname;
		this.name = name;
		this.salary = salary;
	}
	
	
	
}
