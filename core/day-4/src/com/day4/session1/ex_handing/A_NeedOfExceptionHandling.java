package com.day4.session1.ex_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_NeedOfExceptionHandling {

	public static void main(String[] args) {
		
		//Java 7
		//ARM: automatic res mgt ie u dont to close the ip output stream
//		
//		try(Scanner scanner=new Scanner(System.in)) {
//			System.out.println("PE x and y");
//				int x, y;
//				x = scanner.nextInt();
//				y = scanner.nextInt();
//				int z = x / y;
//				System.out.println("value is z: " + z);
//
//			System.out.println("done!");
//			
//		}catch(ArithmeticException ex) {
//			System.out.println("dont put deno as zero");
//		}catch(InputMismatchException ex) {
//			System.out.println("only put ints");
//		}
		
		
		

//		try(Scanner scanner=new Scanner(System.in)) {
//			System.out.println("PE x and y");
//				int x, y;
//				x = scanner.nextInt();
//				y = scanner.nextInt();
//				int z = x / y;
//				System.out.println("value is z: " + z);
//
//			System.out.println("done!");
//			
//		}catch(ArithmeticException | InputMismatchException ex) {
//			System.out.println(ex);
//		}
//		
		
		
		
		
	
//		Scanner scanner=null;
//			try {
//				System.out.println("PE x and y");
//				 scanner = new Scanner(System.in);
//
//					int x, y;
//					x = scanner.nextInt();
//					y = scanner.nextInt();
//					int z = x / y;
//					System.out.println("value is z: " + z);
//
//				System.out.println("done!");
//				
//			}catch(ArithmeticException ex) {
//				System.out.println("dont put deno as zero");
//			}catch(InputMismatchException ex) {
//				System.out.println("only put ints");
//			}finally {
//				scanner.close();
//			}

	}

}
