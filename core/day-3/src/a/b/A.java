package a.b;
//package private
public class A {
	private int i=8;
	int j=80;
	protected int k=800;
	public int m=8000;
	
	private void foo1() {
		System.out.println("foo1 is private method of class A"+i);
	}
	 void foo2() {
		System.out.println("foo2 is default method of class A");
	}
	protected void foo3() {
		System.out.println("foo3 is protected method of class A");
	}
	public void foo4() {
		System.out.println("foo4 is public method of class A");
	}
	
}
