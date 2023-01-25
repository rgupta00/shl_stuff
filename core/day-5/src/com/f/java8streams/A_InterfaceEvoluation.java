package com.f.java8streams;
//interface Foo{
//	void foo();//java 1.7
//	
//	public default void foo2() {
//		System.out.println("foo2 is a default method ...");
//	}
//	
//	public static void fooStatic() {
//		System.out.println("foo2 is a static method ...");
//	}
//}
//class M implements Foo{
//
//	@Override
//	public void foo() {
//		System.out.println("foo is overriden by M");
//	}
//	
//}

interface Foo{
	public default void foo2() {
		System.out.println("foo2 is a default method of Foo...");
	}
}
interface Bar{
	public default void foo2() {
		System.out.println("foo2 is a default method of Bar...");
	}
}
class M implements Foo, Bar{
	
	public void foo2() {
		Foo.super.foo2();
		Bar.super.foo2();
		System.out.println("foo2 is a default method of Bar...");
	}
}

public class A_InterfaceEvoluation {
	
	public static void main(String[] args) {
		Foo f=new M();
//		Foo.fooStatic();
		f.foo2();
	}

}
