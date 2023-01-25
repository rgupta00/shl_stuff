package com.a.classical_threads;

public class D_CreatingThread_Lamabda {
	
	public static void main(String[] args) {
		
	
		Thread thread = new Thread(()-> System.out.println("hello to all"));
		thread.start();
	}

}
