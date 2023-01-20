package com.day2.session1;
//Design pattern:Singleton pattern
//a a class can have private ctr
class MyClass{
	private static MyClass ob=new MyClass();
	
	public static MyClass getMyClass() {
		return ob;
	}
	private MyClass() {
		System.out.println("dare to call");
	}
	
}
public class DemoClassWithPrivateCtr {
	
	public static void main(String[] args) {
		MyClass class1=MyClass.getMyClass();
		System.out.println(class1.hashCode());//hashcode *Collection
		MyClass class2=MyClass.getMyClass();
		System.out.println(class2.hashCode());
		
	}

}
