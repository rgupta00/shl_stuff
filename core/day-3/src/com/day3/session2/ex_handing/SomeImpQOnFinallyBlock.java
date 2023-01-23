package com.day3.session2.ex_handing;

public class SomeImpQOnFinallyBlock {
	
	public static void main(String[] args) {
		//GPP: 1. never ever return the value from finally block
		//		2. .................... throw ex from finally block
		
//		int data=foo();
//		System.out.println(data);
		
//		try{
//			bar();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		
		
		
	}

	static void bar() {
		try {
			if(1==1)
				throw new NullPointerException();
		}finally {
			throw new IllegalStateException();
		}
	}
	 
	 
	 

//	 static int foo() {
//		try {
//			return 0;
//			
//		}finally {
//			return 20;
//		}
//	}

}
