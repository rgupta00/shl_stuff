package com.demo.sol;
import java.util.*;
//O:OCP: aka strategy dp
interface Operation{
	public int apply(int a, int b);
}


final class Calculator{
	int applyOperation ( int a , int b, Operation operation) {
		return operation.apply(a, b);
	}
	
}
public class DemoOCP {

	public static void main(String[] args) {
		
		//u should force client to follow some contract
		Collections.sort(null);//u pass any kind of list provided it have a contract ie Comparble
		
		
		
		Calculator calculator=new Calculator();
		int applyOperation = calculator.applyOperation(2, 2, (a, b)->  a+b);
		
		System.out.println(applyOperation);
		
		int applyOperationMul = calculator.applyOperation(2, 4, ( a,  b)-> a*b);
		System.out.println(applyOperationMul);
		
		int applyOperationDivide = calculator.applyOperation(20, 4, ( a,  b)-> a/b);
		System.out.println(applyOperationDivide);
	}
	
}
