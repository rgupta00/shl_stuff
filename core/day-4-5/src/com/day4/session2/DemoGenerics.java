package com.day4.session2;
import java.util.*;
//Generics<T>:is a compile time funda, it is also called" type erased"
public class DemoGenerics {
	
	public static void main(String[] args) {
		
		//Dont mix gen code with non generic code
		
		List<Integer> s=new ArrayList<>();
		s.add(33);
		
		s.add(3);
		foo(s);
		int sum=0;
		for(Integer temp: s) {
			sum+=temp;
		}
		System.out.println(sum);
	
	}

	 static void foo(List s) {
		s.add("foo");
	}

}









