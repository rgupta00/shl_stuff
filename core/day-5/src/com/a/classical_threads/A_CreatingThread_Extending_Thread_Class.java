package com.a.classical_threads;

//Job and worker analogy 
//Thread and Runnable
//
class MyJob implements Runnable{

	@Override
	public void run() {
		System.out.println("job is started by the thraed :"+ Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("job is done by the thraed :"+ Thread.currentThread().getName());
	}
	
}

public class A_CreatingThread_Extending_Thread_Class {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main is started");
		System.out.println(Thread.currentThread().getName());

		MyJob job=new MyJob();
		Thread thread=new Thread(job, "A");
		
		Thread thread2=new Thread(job, "B");
		
		
		thread.start();
		thread2.start();
		//thread.start();
		
		thread.join();
		thread2.join();
		System.out.println("main is end");
	}

}
