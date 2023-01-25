package com.day4.session2.collection_api;
import java.util.*;
import static java.lang.Math.*;
public class B_HelloCollection2 {

	public static void main(String[] args) {
		//Why to use generics
		System.out.println(PI);
		
		List<Employee> list=new LinkedList<>();
		list.add(new Employee(12, "raj", 45.0));
		list.add(new Employee(2, "ekta", 85.0));
		list.add(new Employee(120, "gun", 75.0));
		list.add(new Employee(92, "keshav", 25.0));
		
		
//		list.stream().forEach(e-> System.out.println(e));
		
		
		System.out.println("--------List of all emp----------");
		printEmps(list);
		
		System.out.println("------sorted as per id-----------");
		Collections.sort(list);
		printEmps(list);
		
		
		System.out.println("------sorted as per name-----------");
		Collections.sort(list, new NameSorter());
		printEmps(list);
		
//		System.out.println("------sorted as per salary-----------");
//		Collections.sort(list,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return Double.compare(o2.getSalary(), o1.getSalary());
//			}
//		});
//		printEmps(list);
		
		System.out.println("------sorted as per salary-----------");
		Collections
		.sort(list,Comparator.comparing(Employee::getSalary));

		printEmps(list);
		
		
	}

	private static void printEmps(List<Employee> list) {
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
