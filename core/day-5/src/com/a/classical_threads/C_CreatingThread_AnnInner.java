package com.a.classical_threads;

public class C_CreatingThread_AnnInner {

	public static void main(String[] args) {

	
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
					System.out.println("job of the thread...");
			}
		});
		thread.start();
		System.out.println("---------");
	}

}
