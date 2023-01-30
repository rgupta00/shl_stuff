package com.demo2;

class Foo{
	
	//init block in java
	
	{
		System.out.println("it is normal init block");
	}
	
	
	static {
		System.out.println("it is static init block for Foo");
	}

	Foo(){
		
		System.out.println("ctr of Foo");
	}
}


class Bar extends Foo{
	
	//init block in java
	static {
		System.out.println("it is static init block for Bar");
	}

	Bar(){
		System.out.println("ctr of Foo");
	}
}


public class DoubtsOnStatic {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Bar bar=new Bar();
		
		
	}

}
