package com.demo;

public class Car {
	
	private Engine engine;
	private Tyre tyre;
	
	public Car() {
		engine=new Engine();
		tyre=new Tyre();
	}
	
	public void drive() {
		engine.move();
		tyre.rotate();
	}
	
}
