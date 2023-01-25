package com.c.juc_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CpuIntensiveJob implements Runnable{

	@Override
	public void run() {
		System.out.println("some cpu intestive job");
	}
	
}
public class F_ThreadPool_Ex1 {

	public static void main(String[] args) {
		int noOfCors=Runtime.getRuntime().availableProcessors();
		ExecutorService es= Executors.newFixedThreadPool(noOfCors);
		
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
