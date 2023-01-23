package com.day3.session1.q1;
import java.util.*;
class Employee extends Object{
	private int id;
	private String name;
	private String dept;
	private double salary;
	
	public Employee(int id, String name, String dept, double salary) {
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=")
		.append(id)
		.append(", name=")
		.append(name)
		.append(", dept=")
		.append(dept)
		.append(", salary=").append(salary).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return 1;
		//return new Random().nextInt();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other =(Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	

	
}
public class B_DemoObjectClass {

	public static void main(String[] args) {
		
		Object employee1= new Employee(1, "raj", "IT", 45);
		
		Object employee2= new Employee(1, "raj", "IT", 45);
		
		if(employee1.equals(employee2)) {
			System.out.println("objects are eq");
		}else
			System.out.println("not ...");
		
	}

}








