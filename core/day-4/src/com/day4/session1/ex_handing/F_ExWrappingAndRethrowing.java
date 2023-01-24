package com.day4.session1.ex_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyCalException extends RuntimeException{

	public MyCalException(Throwable cause) {
		super(cause);
	}
	
}



public class F_ExWrappingAndRethrowing {
	
	public static void main(String[] args) {
		
		try{
			callMe();
		}catch (MyCalException e) {
			System.out.println(e.getCause());
		}
	}

	 static void callMe() {
		
			try(Scanner scanner=new Scanner(System.in)) {
			System.out.println("PE x and y");
				int x, y;
				x = scanner.nextInt();
				y = scanner.nextInt();
				int z = x / y;
				System.out.println("value is z: " + z);

			System.out.println("done!");
			
		}catch(ArithmeticException | InputMismatchException ex) {
			throw new MyCalException(ex);
		}
	}

}
