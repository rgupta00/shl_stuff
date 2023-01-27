package com.day5.session1.demo_generics;
import java.util.*;
class Animal{
	
}
class Dog extends Animal{
	
}


class CostlyDog extends Dog{
	
}

class Cat extends Animal{
	
}
public class DemoGen {
	
	public static void main(String[] args) {
		Dog[]dogs= {new Dog(), new CostlyDog()};
		foo(dogs);
//		for(Dog dog: dogs) {
//			System.out.println(dog);
//		}
	}

	private static void foo(Animal[] dogs) {
		dogs[0]=new Cat();
	}
}
