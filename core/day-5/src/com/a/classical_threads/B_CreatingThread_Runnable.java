package com.a.classical_threads;
class MyThread extends Thread{
	public void run() {
		System.out.println("job of the threads");
	}
}
public class B_CreatingThread_Runnable {
	
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
	}

}
