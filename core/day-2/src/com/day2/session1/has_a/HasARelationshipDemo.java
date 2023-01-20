package com.day2.session1.has_a;

public class HasARelationshipDemo {
	
	public static void main(String[] args) {
//		Employee employee=
//				new Employee(2, "raj"	, "it", 45, 
//						"A21", "dehli", "In", "110071");
//		employee.printEmployeeDetails();
		
		Company company=new Company("SHL", "Gur");
		company.addEmployee("ravi", "sales", 45, "new city ", "kanpur", "in", "6455555");
		company.addEmployee("ravi", "sales", 45, "new city ", "kanpur", "in", "6455555");
		company.addEmployee("ravi", "sales", 45, "new city ", "kanpur", "in", "6455555");
		company.addEmployee("ravi", "sales", 45, "new city ", "kanpur", "in", "6455555");
		
		company.addEmployee("ravi", "sales", 45, "new city ", "kanpur", "in", "6455555");
		
		company.printCompanyDetailsWithEmployees();
		
		
	}

}
