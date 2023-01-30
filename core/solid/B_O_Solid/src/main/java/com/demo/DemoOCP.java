package com.demo;
//O:OCP: 

interface Operation{
	public int apply(int a, int b);
}

//As per OCP
 class Calculator{
	 
	int applyOperation ( int a , int b, Operation operation) {
		return operation.apply(a, b);
	}
	
}
public class DemoOCP {

	public static void main(String[] args) {
		
		Calculator calculator=new Calculator();
		
		Operation addOp=(x,y)-> x+y;
		
		System.out.println(calculator.applyOperation(2, 3, addOp));
		
		
		Operation mulOp=(x,y)-> x*y;
		
		System.out.println(calculator.applyOperation(2, 3, mulOp));
		
		
	}
}
