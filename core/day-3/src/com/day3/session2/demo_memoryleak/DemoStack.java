package com.day3.session2.demo_memoryleak;

public class DemoStack {
	
	public static void main(String[] args) {
		
			Stack stack=new Stack();
			stack.push(new Emp(1, "raj"));
			stack.push(new Emp(2, "ekta"));
			stack.push(new Emp(3, "gun"));
			stack.push(new Emp(4, "keshav"));
			
			
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
	}

}
