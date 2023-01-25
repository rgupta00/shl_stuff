package com.day5.session1.demo_generics;

public class DemoStack {
	
	public static void main(String[] args) {
		
		Stack<Product> stack=new Stack<Product>(Product.class);
		stack.push(new Product(1, "laptop"));
		
		
		
		System.out.println(stack.pop());
		
		
//			Stack<Emp> stack=new Stack<Emp>(Emp.class);
//			stack.push(new Emp(1, "raj"));
//			stack.push(new Emp(2, "ekta"));
//			stack.push(new Emp(3, "gun"));
//			stack.push(new Emp(4, "keshav"));
//			
//			
//			System.out.println(stack.pop());
//			System.out.println(stack.pop());
//			System.out.println(stack.pop());
//			System.out.println(stack.pop());
	}

}
