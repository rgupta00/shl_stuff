package com.day2.session1.is_a;

abstract class Shape {
	private String color;

	public abstract void getArea();

	public Shape(String color) {
		this.color = color;
	}

	public void printColor() {
		System.out.println("color " + color);
	}
}

class Circle extends Shape {

	public Circle(String color) {
		super(color);
	}

	@Override
	public void getArea() {
			System.out.println("PI * r *r ");
	}

}

public class DemoAbClass {
	public static void main(String[] args) {

	}

}
