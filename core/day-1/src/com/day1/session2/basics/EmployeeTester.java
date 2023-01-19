package com.day1.session2.basics;

class Employee{
	private int id;
	private String name;
	private double salary;
	private String dept;
	private static int counter = 0;

	public Employee() {
	}

	//why static method ::
	
	public static int getCounter() {
		return counter;
	}
	
	
	
	public Employee(String name, double salary, String dept) {

		this.id = ++counter;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		System.out.println("emp id : "+ id+ "name : "+ name);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", dept=");
		builder.append(dept);
		builder.append("]");
		return builder.toString();
	}

}

public class EmployeeTester {

	public static void main(String[] args) {
		Employee employee = new Employee("raj", 45, "trainer");

		Employee employee2 = new Employee("ekta", 45, "HW");

		Employee employee3 = new Employee("gun", 45, "student");

		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);
		
		System.out.println(Employee.getCounter());


	}

}
