package com.day2.session1.poly;

import java.util.Scanner;

 class Shape {
	public  void printArea() {
		System.out.println("what is the shape dont know");
	}
}

class Circle extends Shape{
	@Override
	public void printArea() {
		System.out.println("PI * r * r");
	}

}

class Rectangle extends Shape{

	@Override
	public void printArea() {
		System.out.println("l * b");
	}

}

class Triangle extends Shape{

	@Override
	public void printArea() {
		System.out.println("1/2 * b * h");
	}

}

public class DemoPolymorphism {

	public static void main(String[] args) {

		Shape s=null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pls choice 1.Circle 2.Rectangle 3.Triangle");
		int choice = scanner.nextInt();
		if (choice == 1) {
			s=new Circle();
		} else if (choice == 2) {
			s=new Rectangle();

		} else if (choice == 3) {
			s=new Triangle();
		}
		
		if(s!=null) {
			s.printArea();
		}else {
			System.out.println("Enter correct choice");
		}
		scanner.close();
	}

}
