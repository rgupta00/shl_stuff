package com.c.juc_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class IOIntensiveJob implements Runnable{

	@Override
	public void run() {
		System.out.println("some cpu intestive job");
	}
	
}
public class G_ThreadPool_Ex2 {

	public static void main(String[] args) {
		
		ExecutorService es= Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++) {
			es.execute(new CpuIntensiveJob());
		}
		
		es.shutdown();
		
		
		
		/*
		 * Type of thread pool:
		 * Fixed thraed pool: cpu intestive job
		 * chached ...		: io
		 * Scheduled ....
		 * SingleThreadPool...
		 * ForkandJoin...
		 * 
		 */
	}
}
