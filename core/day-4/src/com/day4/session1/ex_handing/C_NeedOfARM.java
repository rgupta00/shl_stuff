package com.day4.session1.ex_handing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C_NeedOfARM {
	
	public static void main(String[] args) {
		
		//Java 7 : Automatic resouce mgt
		
//		try{
//			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
//		}catch(FileNotFoundException e) {
//			
//		}
		
		try(BufferedReader br=new BufferedReader(new FileReader("data.txt"))){
			
		}catch(IOException e) {
			
		}
		
		
//		
//		try(Scanner scanner=new Scanner(System.in)) {
//			
//		}
//		
		try(Scanner scanner=new Scanner(System.in)) {
			System.out.println("PE x and y");
			
			int x, y;
			x = scanner.nextInt();
			y = scanner.nextInt();
			int z = x / y;
			System.out.println("value is z: " + z);

		} catch (ArithmeticException e) {
			System.out.println("deno should not be zero");

		} catch (InputMismatchException e) {
			System.out.println("pls enter int only");

		} 
		
		
		
		
//		Scanner scanner = null;
//		try {
//			System.out.println("PE x and y");
//			scanner = new Scanner(System.in);
//
//			int x, y;
//			x = scanner.nextInt();
//			y = scanner.nextInt();
//			int z = x / y;
//			System.out.println("value is z: " + z);
//
//		} catch (ArithmeticException e) {
//			System.out.println("deno should not be zero");
//
//		} catch (InputMismatchException e) {
//			System.out.println("pls enter int only");
//
//		} finally {
//			scanner.close();
//		}

	}

}
