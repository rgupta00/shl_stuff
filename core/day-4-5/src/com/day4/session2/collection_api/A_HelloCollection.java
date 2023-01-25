package com.day4.session2.collection_api;
import java.util.*;
public class A_HelloCollection {

	public static void main(String[] args) {
		//Why to use generics
		
		List<String> list=new LinkedList<>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		//Enumeraor, Iterator, ListIterator
		
		//System.out.println(list);
		ListIterator<String> it=list.listIterator(list.size());
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		//System.out.println(list);
		
		
		
		
		
		
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			it.next();
//			it.remove();
//		}
//		System.out.println(list);
		
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println(list);
		
		//Sytex suger
//		for(String d: list) {
//			System.out.println(d);
//		}
		
//		System.out.println(list);
//		
//		Collections.sort(list);
//		
//		int val=Collections.binarySearch(list, "jar");
//		System.out.println(val);
//		
//		System.out.println(list);
//		
		
		
		
		
		
		
		
		
//		List list=new ArrayList();
//		list.add("foo");
//		list.add(33);
//		list.add(new Employee(1, "raj", 390000));
//		
//		Object o=list.get(1);
//		if(o instanceof Employee) {
//			Employee employee=(Employee)o;
//		}else {
//			System.out.println("it is not a emp object");
//		}
		
		
	}
}
