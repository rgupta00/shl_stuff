package com.day5.session1;

import java.util.*;

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

class CostlyDog extends Dog {

}

public class DemoGenericsInterviewQ {

	public static void main(String[] args) {
		List<Animal> dogs = new ArrayList<>();
		dogs.add(new Animal());
		dogs.add(new Dog());
		
		foo(dogs);
		

	}

	 //lower bound: super of Dog is Animal
	 static void foo(List<? super Dog> dogs) {
		 //	dogs.add(new Dog()); //?
//		 	
//		 	for(Object d: dogs) {
//		 		System.out.println(d);
//		 	}
		 	
	}

}









