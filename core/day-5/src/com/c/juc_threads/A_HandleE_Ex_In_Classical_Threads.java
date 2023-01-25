package com.c.juc_threads;

import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;
//u can not throw checked ex...only trick is to wrap into unchecked ex and  throw
//how to handle ex in classical thread

class MyJob implements Runnable {

	@Override
	public void run() {
		// u can not throw checked ex...only trick is to wrap into unchecked ex and
		// throw
		if (1 == 1) {
			throw new RuntimeException(new IOException());
		}
	}

}

class MyExHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("thread " + t.getName() + " got some ex " + e);
	}

}

public class A_HandleE_Ex_In_Classical_Threads {

	public static void main(String[] args) {
		MyJob job = new MyJob();
		Thread thread = new Thread(job, "A");

		thread.setUncaughtExceptionHandler(new MyExHandler());
		thread.start();

		System.out.println("end");
	}
}
