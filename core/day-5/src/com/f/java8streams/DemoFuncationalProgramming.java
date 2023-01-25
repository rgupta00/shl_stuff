package com.f.java8streams;
import java.util.*;
import java.util.stream.Collectors;
//declartive data procssing pipeline---Funcational programing--> lambda exp--> Funcational interface--> interface evoluation


public class DemoFuncationalProgramming {
	
	//funcational programming? declartive data processing
	//SQL			java
	
	public static void main(String[] args) {
		
		List<Emp> emps=new ArrayList<Emp>();
		emps.add(new Emp(1, "raj", 660000, "IT"));
		emps.add(new Emp(15, "ekta", 560000, "IT"));
		emps.add(new Emp(7, "gun",968000, "Sales"));
		emps.add(new Emp(9, "keshav", 560000, "Mkt"));
		
		
		
		//find the name of all emp whose are working in it temp dept sorted by there sal
		
		//java 8 :)
//		List<String> names = emps.stream()
//				.filter(e->e.getDept()
//				.equals("IT"))
//				.sorted(Comparator.comparing(Emp::getSalary).reversed())
//		.map(e-> e.getName()).collect(Collectors.toList());
//		
//		names.forEach(name-> System.out.println(name));
//		
//		
		
		// java 1.7 :(
//		Collections.sort(emps, new Comparator<Emp>() {
//
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				return Double.compare(o2.getSalary(), o1.getSalary());
//			}
//		});
//		List<Emp> empsInITdept=new ArrayList<Emp>();
//		for(Emp e: emps) {
//			if(e.getDept().equals("IT")) {
//				empsInITdept.add(e);
//			}
//		}
//		
//		
//		List<String> names=new ArrayList<String>();
//		for(Emp e: empsInITdept) {
//			names.add(e.getName());
//		}
//		
//		for(String name: names) {
//			System.out.println(name);
//		}
	}

}
