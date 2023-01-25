package com.day4.session2;
import java.util.*;
//Generics<T>:is a compile time funda, it is also called" type erased"
public class DemoGenerics2 {
	
	public static void main(String[] args) {
		//? extends XX
		//? super XX
		///PECS(producer extends and consumer super) rule
		
		List<Integer> s=new ArrayList<>();
		s.add(33);
		s.add(3);
		s.add(393);
		
		print(s);
		
		List<Double> s2=new ArrayList<>();
		s2.add(33.9);
		s2.add(3.7);
		s2.add(393.77);
		
		print(s2);
		
		List<Emp> emps=new ArrayList<>();
		emps.add(new Emp(1, "raj", 56.99));
		emps.add(new Emp(18, "raj", 56.99));
		emps.add(new Emp(177, "gun", 56.99));
		
		print(emps);
		
		
	}

		//PECS
	 static void print(List<? > s) {
		 
		for(Object temp: s) {
			System.out.println(temp);
		}
	}
	
	
	
//	 static void print(List<? super Integer> s) {
//		s.add(555);
//	}
	
	
	//hey java i can pass any list whose memeber have something to do with object
	//class , i promise i will iterate (print ) i will not change it
	 
	///PECS(producer extends and consumer super) rule
//	private static void print(List<? extends Object> s) {
//		s.add("foo");
//		for(Object temp: s) {
//			System.out.println(temp);
//		}
//	}

//
//	private static void print(List<? extends Object> s) {
//		for(Object temp: s) {
//			System.out.println(temp);
//		}
//	}

	

}









