package com.day2.session1.has_a;

import java.util.*;

public class Company {
	private String companyName;
	private String companyAddress;
	private  int employeeCounter=0;

	private List<Employee> employees=new ArrayList<>();
	
	public Company(String companyName, String companyAddress) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	public void addEmployee(String employeeName, String employeeDept, double employeeSalary, 
			String addressLine, String city, String country, String pinCode) {
		Employee employee=new Employee(++employeeCounter, employeeName,
				employeeDept, employeeSalary, addressLine, city, country, pinCode);
		
		employees.add(employee);
		
	}
	
	public void printCompanyDetailsWithEmployees() {
		System.out.println("CompanyDetails");
		System.out.println("CompanyName: "+ companyName);
		System.out.println("CompanyAddress: "+ companyAddress);
		System.out.println("Emp strength: "+ employeeCounter);
		
		System.out.println("---Employee details---------");
		
		for(Employee employee: employees) {
			employee.printEmployeeDetails();
		}
		
	}
	
	

}









