package com.day3.session2;
import java.io.*;
import java.util.*;
public class A_DemoString {
	
	public static void main(String[] args) {
		
		//how to print all words from the file (unique, freq)
		Set<String> set=new TreeSet<String>();
	try {
		BufferedReader br=
				new BufferedReader(new FileReader("data.txt"));//Decorator dp
		
		String line=null;
		while((line=br.readLine())!=null) {
			String tokens[]=line.split(" ");
			for(String token: tokens) {
				set.add(token.toLowerCase());
			}
		}
		
		
	}catch(FileNotFoundException e) {
		System.out.println("file not found");
	}catch(IOException e) {
		System.out.println("some io ex happends");
	}
		
	for(String data: set) {
		System.out.println(data);
	}
		
		
		//some common string methods
		
//		String data="i love coding";
//		String []tokens=data.split(" ",1);
//		for(String token: tokens) {
//			System.out.println(token);
//		}
//		
		
		
		//how string works, spring pool, performance
		//String vs 		StringBuffer vs StringBuilder, when to use what
		//immutable						mutable
		
		
//		String data="a"+"b"+"c";
//		String data2=new StringBuilder().append("a").append("b").append("c").toString();
//		
//		
//		
		
		
		
		
		
		
		
		
		
//		String data="i love coding";
//		String rev=new StringBuilder().append(data).reverse().toString();
//		System.out.println(rev);
	
		
		
		
		
		
		
		
		//u an create object even without new operation
				//string object stored into string pool are immutable
		//String data2=new String("hello");
		
		//System.out.println(data==data2);
		
//		
//		String data="hello";
//		String data2="hello";
//		
//		data2=data2+"by";
		
		//System.out.println(data==data2);
		
	}
	

}
