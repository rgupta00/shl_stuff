package com.day2.session1;
//class:Employee
//object : are runtime ex of class
class Employee{
	private int id;
	private String name;
	private String dept;
	private double salary;
	//ctr
	public   Employee() {}
	//para ctr
	
	
	
	//BL
	public double netSalary() {
		return 0.8*salary;
	}
	public Employee(int id, String name, String dept, double salary) {
		super();//*
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printEmployeeDetails() {
		System.out.println("id: "+ id+" name : "+ name+" salary: "+ salary+" dept: "+ dept);
		System.out.println("net salary: "+ netSalary());
	}
	
	
}
public class EmployeeDemo {
	
	public static void main(String[] args) {
		Employee employee=new Employee(3, "raj", "sales", 45);
		employee.printEmployeeDetails();
		
		System.out.println(employee.netSalary());
	}

}
