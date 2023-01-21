package com.day2.session1.poly;

class Cal{
	
	public double add(int a, double b) {
		System.out.println("public double add(int a, double b) ");
		return a+b;
	}
	public double add(double a, int b) {
		System.out.println("public double add(double a, int b)");
		return a+b;
	}

}

public class DemoCalApp {
	public static void main(String[] args) {
		
		Cal cal=new Cal();
		double sum=cal.add(2.0, 3);
		
		int i=0;
		double j=5;
		
		i=(int) j;
		
		//Upcating and downcasting*
		
		
	}

}
