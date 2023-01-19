package com.day1.session2.basics;

public class DemoArray {
	
	public static void main(String[] args) {
		
//		Employee employee2=null;
//		System.out.println(employee2.getName());
//		
		
		Employee[]employees= {
				new Employee("raj", 45, "Training"),
				new Employee("raj", 45, "Training"),
				new Employee("raj", 45, "Training")
				
				};
		for(Employee e: employees) {
			e.print();
		}
		
		//arrays are object and stored in heap
		//int arr[]=new int[4];
		//Enhance for loop java5
//		for(int temp: arr) {
//			System.out.println(temp);
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
