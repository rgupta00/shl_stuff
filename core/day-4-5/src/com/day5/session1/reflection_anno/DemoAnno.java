package com.day5.session1.reflection_anno;
//annotation and java reflection
import java.util.*;
class A{
	
	@Deprecated
	void foo() {
		@SuppressWarnings({ "unused", "rawtypes" })
		List list=new ArrayList();
	}
}
class B extends A{
	
	@Override	//aka meta data 
	void foo() {
		
	}
}
public class DemoAnno {
	
	public static void main(String[] args) {
		A a=new A();
		a.foo();
	}

}
