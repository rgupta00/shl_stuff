package com.demo;

//Rectangle "reuse" Square : Inheritance 
//sqare rectangle project

class Rectangle {
	private int l, b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}

	public int calculateArea() {
		return l * b;
	}

}
//
//class Square extends Rectangle {
//	public Square(int l) {
//		super(l, l);
//	}
//	
//}



class Square  {
	private Rectangle rectangle=null;
	
	public Square(int l) {
		this.rectangle=new Rectangle(l, l);
	}

	public int calculateArea() {
		return rectangle.calculateArea();
	}
	public void changeDimension(int changeDimension) {
		this.rectangle.setB(changeDimension);
		this.rectangle.setL(changeDimension);
	}
}


public class DemoLiskov {

	public static void main(String[] args) {
		
		Square square=new Square(4);
		
		System.out.println(square.calculateArea());
		
		
		square.changeDimension(5);
		
		
		System.out.println(square.calculateArea());
		
		
		
		
		
		
		
		
//		/*
//		 * 
//		 * favour composition over inheritance square rectangle liskov java
//		 * 
//		 */
//		Square square=new Square(3);
//		int area=square.calculateArea();
//		System.out.println(area);
//		square.setB(10);
//		area=square.calculateArea();
//		System.out.println(area);
	
	}
}
