package com.day2.session1.is_a;
class A{
	private int i;
	public A(int i) {
		this.i=i;
	}
	public void printI() {
		System.out.println("i: "+ i);
	}
}

class B extends A{
	private int j;
	public B(int i, int j) {
		super(i);
		this.j=j;
	}
	
	public void printJ() {
		System.out.println("j: "+ j);
		printI();
	}
}
class C extends B{
	private int k;
	public C(int i, int j, int k) {
		super(i,j);
		this.k=k;
	}
	
	public void printk() {
		System.out.println("k: "+ k);
		printJ();
		printI();
	}
}

public class DemoInh {
	
	public static void main(String[] args) {
		C c=new C(4,6,7);
		
		c.printk();
	}

}
