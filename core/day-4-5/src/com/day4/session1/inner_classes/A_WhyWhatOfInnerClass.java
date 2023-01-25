package com.day4.session1.inner_classes;

//class Outer{
//
//	private int i=9;
//	
//	 class Inner{
//		int i=44;
//		 void fooInner() {
//			 System.out.println("foo method of inner class "+Outer.this.i+" "+this.i);
//		 }
//	 }
//}

//class A{
//
//	public void foo() {
//		class B{
//			void bar() {
//				System.out.println("bar method ...");
//			}
//		}
//		B b=new B();
//		b.bar();
//	}
//}

interface Cookable {
	public void cook();
}

public class A_WhyWhatOfInnerClass {

	public static void main(String[] args) {
		
		//*
		Cookable cookable4 = 
				()-> System.out.println("street food looked good but bad...");
		
		

		Cookable cookable = new Cookable() {

			@Override
			public void cook() {
				System.out.println("street food looked good but bad...");
			}
		};

		cookable.cook();

		Cookable cookable2 = new Cookable() {

			@Override
			public void cook() {
				System.out.println("hotel food look ok but heavy on the pocket");
			}
		};

		cookable2.cook();

		Cookable cookable3 = new Cookable() {

			@Override
			public void cook() {
				System.out.println("home food :)");
			}
		};

		cookable3.cook();

//		A a=new A();
//		a.foo();
//		Outer ob1=new Outer();
//		Outer.Inner ob=new Outer().new Inner();
//		ob.fooInner();

	}
}
