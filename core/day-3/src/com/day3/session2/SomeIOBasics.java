package com.day3.session2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SomeIOBasics {

	public static void main(String[] args) {
		
		//read photo
		
		///home/raj/Desktop/print_out_new/quote.jpeg
		
		//We want to make a copy of this photo
		
//		long start=System.currentTimeMillis();
//			
//		try {
//			FileInputStream fis=
//					new FileInputStream("/home/raj/Desktop/print_out_new/quote.jpeg");
//			FileOutputStream fos=
//					new FileOutputStream("/home/raj/Desktop/print_out_new/quote2.jpeg");
//			
//			int data=0;
//			while((data=fis.read())!=-1) {
//				fos.write(data);
//			}
//			
//			fos.close();
//
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		
//		long end=System.currentTimeMillis();
//		System.out.println("time taken: "+ (end-start)+" ms");
		
		
	
		long start=System.currentTimeMillis();
		
		try {
			BufferedInputStream fis=
					new BufferedInputStream
					(new FileInputStream("/home/raj/Desktop/print_out_new/quote.jpeg"));
			
			
			BufferedOutputStream fos=
					new BufferedOutputStream
					(new FileOutputStream("/home/raj/Desktop/print_out_new/quote2.jpeg"));
			
			int data=0;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			
			fos.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		long end=System.currentTimeMillis();
		System.out.println("time taken: "+ (end-start)+" ms");
		
		
		
		
		
		
		
		
		//char vs byte stream
		
//		try {
//			BufferedReader br=new BufferedReader(new FileReader("data.txt"));
//			String data=null;
//			while ((data=br.readLine())!=null) {
//				System.out.println(data);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("file not find");
//		} catch (IOException e) {
//			System.out.println("some io ex");
//		}

		
		
		

//		try {
//			FileReader fr = new FileReader("data.txt");
//			int data = 0;
//			while ((data = fr.read()) != -1) {
//				System.out.print((char) data + " ");
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("file not find");
//		} catch (IOException e) {
//			System.out.println("some io ex");
//		}

	}

}
