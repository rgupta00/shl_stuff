package com.a.creational.prototype;

import java.util.Date;

public class DemoClonning {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee=new Employee(2, "raj", new Date());
		
		Employee employeeCloned=(Employee) employee.clone();
		
		System.out.println(employee);
		System.out.println(employeeCloned);
		
		employee.setName("rajesh");
		
		
		System.out.println("--in the case of string---(we dont need deep copy)-----");
		System.out.println(employee);
		System.out.println(employeeCloned);
		
		
		System.out.println("--in the case of dob---(we need deep copy)-----");
		employee.getHireDay().setDate(31);
		System.out.println(employee);
		System.out.println(employeeCloned);
		
		
	}
}
