package com.f.java8streams;

public class Emp {
	private int id;
	private String name;
	private double salary;
	private String dept;
	
	static boolean isRich(Emp emp) {
		return emp.salary>1_000_0000;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Emp(int id, String name, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
	

}
