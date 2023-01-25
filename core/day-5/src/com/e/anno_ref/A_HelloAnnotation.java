package com.e.anno_ref;
import java.util.*;

class A{
	void itIsAVerySimpleMethod() {
		System.out.println("itIsAVerySimpleMethod....");
	}
	//Hey DONT USE IT 
	@Deprecated
	void oldApi() {
		System.out.println("old and gray code...");
	}
	
	
	@SuppressWarnings("unchecked")
	void someRandomStuff() {
		
		@SuppressWarnings("rawtypes")
		List list=new ArrayList();
		list.add("foo");
	}
}
class B extends A {
	@Override //aka meta data, data about data
	void itIsAVerySimpleMethod() {
		System.out.println("itIsAVerySimpleMethod is overriden...");
	}
}
public class A_HelloAnnotation {

	public static void main(String[] args) {
		//What is annotation? why i should care about it
		A a=new B();
		a.itIsAVerySimpleMethod();
		a.oldApi();
	}
}
