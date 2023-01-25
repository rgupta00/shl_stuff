package com.a.classical_threads_need;

//file donwload manager 
class DownloadManager {
	
	public static void download(String url) {
		System.out.println(Thread.currentThread().getName() +" start downloading "+ url);
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("some ex");
		}
		
		System.out.println(Thread.currentThread().getName() +" done downloading "+ url);
		
	}

}