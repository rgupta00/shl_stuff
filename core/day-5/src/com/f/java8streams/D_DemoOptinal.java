package com.f.java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class D_DemoOptinal {
	
	//Optional<T> java 8
	//amit
	public static void main(String[] args) {
		Optional<Emp> empOp = getById(10);
		
		String name=empOp
				.map(e-> e.getName())
				.orElse("name not found");
		System.out.println(name);
		
		
	}
	
	
	//Raj
	public static Optional<Emp>  getById(int eid) {
		//hit the database and if emp is not found i will return null
		return Optional.ofNullable(null);
	}

}
