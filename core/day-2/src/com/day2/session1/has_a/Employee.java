package com.day2.session1.has_a;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeDept;
	private double employeeSalary;
	
	private Address address;

	public Employee(int employeeId, String employeeName, String employeeDept, double employeeSalary, 
			String addressLine, String city, String country, String pinCode) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeSalary = employeeSalary;
		this.address = new Address(addressLine, city, country, pinCode);
	}
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}




	public String getEmployeeName() {
		return employeeName;
	}


	public String getEmployeeDept() {
		return employeeDept;
	}



	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}



	public double getEmployeeSalary() {
		return employeeSalary;
	}



	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public void printEmployeeDetails() {
		System.out.println("employeeId: "+ employeeId+" employeeName: "+ employeeName+" employeeDept "+
				employeeDept+"employeeSalary "+ employeeSalary);
		address.printAddress();
	}

	

}
