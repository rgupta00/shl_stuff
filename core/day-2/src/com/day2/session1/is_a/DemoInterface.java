package com.day2.session1.is_a;

//interface Demo{
//	void foo();
//}
//class DemoImp implements Demo{
//
//	@Override
//	public void foo() {
//		System.out.println("foo is overriden");
//	}
//	
//}

interface A1{
	 int x=88;
	public void foo();
}
interface B1{
	 int x=880;
	public void foo();
}

class C1 implements A1,B1{

	@Override
	public void foo() {
		System.out.println(B1.x);
	}
	
}







//
//class A1{
//	public void foo() {
//		System.out.println("foo of class A");
//	}
//}
//class B1{
//	public void foo() {
//		System.out.println("foo of class B");
//	}
//}
//
//class C1 extends A1,B1{
//	public void foo() {
//		super.foo();
//	}
//}


public class DemoInterface {
	public static void main(String[] args) {
		
	}

}













