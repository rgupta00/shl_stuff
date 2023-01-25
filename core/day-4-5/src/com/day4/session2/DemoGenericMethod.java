package com.day4.session2;

import java.util.ArrayList;
import java.util.List;

import com.day5.session1.CostlyDog;
import com.day5.session1.Dog;

class Dog{
}
class CostlyDog extends Dog{
}
public class DemoGenericMethod {
	//exmaple of super
	public static void main(String[] args) {
		List<Dog> dogs=new ArrayList<>();
		dogs.add(new Dog());
		dogs.add(new CostlyDog());
		foo(dogs);
		
	}
	//PECS
	 static void foo(List<? super Dog> dogs) {
		dogs.add(new Dog());
//		for(Dog d: dogs) {
//			System.out.println(d);
//		}
	}

}





