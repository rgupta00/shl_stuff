package com.f.java8streams;

import java.awt.print.Book;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class C_Java8FI {
	
	public static String join(  String a, String b) {
		return a.concat(b);
	}
	
	public static void main(String[] args) {
		/*
		 * java 8 have given my FI
		 * 1. Predicate
		 * 2. Function
		 * 3. consumer
		 * 4. Supplier 
		 *...
		 */
		
//		Consumer<String> consumer= name-> System.out.println(name);
//			
//		consumer.accept("amit kr");


		//BiConsumer<String, String> demo=( fName,  lName)-> 	System.out.println(fName+": "+ lName);
			
		
		Supplier<String> supplier=()->  "java champs";
		
		System.out.println(supplier.get());
		
		
		
		
		
		
		//Funcation
//		Function<String, Boolean> function=name-> name.contains("raj");
//		System.out.println(function.apply("rajesh"));
		
		//BiPredicate<Integer, Integer> biPredicate=(x,y)->x>=y;
		
		
//		Predicate<Integer> predicateEven= n->  n%2==0;
//			
//		System.out.println(predicateEven.test(330));
//		
//		
//		
//		
//		Predicate<Emp> ePredicate=e-> e.getSalary()>1_000_0000;
//		System.out.println(ePredicate.test(new Emp(1, "raj", 50000000, "IT")));
		//or
		
	//	Predicate<Emp> ePredicate2=Emp::isRich;
		
		
		
		
		
		
//		Function<String, Integer> function=new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String name) {
//				return name.length();
//			}
//		};
//		
//		
//		Function<String, Integer> function= name-> name.length();
//	
//		Function<Emp, Double> function2=e->e.getSalary();	//lambda vs Method ref ::
//		
		
//		BiFunction<String, String, String> biFunction=
//				( fName,  lName)-> fName.concat(lName);
				
		
//		BiFunction<String, String, String> biFunction=
//				C_Java8FI::join;
				
		//no is even or odd
//		Predicate<Integer> predicateEven=new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer n) {
//				return n%2==0;
//			}
//		};
		
	//	Predicate<Integer> predicateEven= n-> n%2==0;
		
		//BiPredicate<Integer, Integer>biPredicate=( x,  y)->  x>y;
			
		
		
		
//		
//		System.out.println(predicateEven.test(55));
//		
//		Predicate<String> nameContainRaj=name-> name.contains("raj");
//		
//		Predicate<Emp>empPredicateMoreThen60Lac=emp-> emp.getSalary()>=60_00000;
//		Predicate<Emp>empPredicateNameContainRaj=emp-> emp.getName().contains("raj");
//		
//		Predicate<Emp> richOrNameContainRaj=empPredicateMoreThen60Lac.and(empPredicateNameContainRaj).negate();
//		
//		Emp emp=new Emp(1, "umesh", 670000, "IT");
//		
//		boolean isValid= richOrNameContainRaj.test(emp);
//		System.out.println(isValid);
		
		
		
		
		
	}

}











