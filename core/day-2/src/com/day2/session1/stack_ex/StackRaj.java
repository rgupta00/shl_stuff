package com.day2.session1.stack_ex;
//raj
public class StackRaj implements Stack{
	private int arr[];
	private int top;
	private int size=5;
	
	public StackRaj() {
		arr=new int[size];
		top=-1;
	}
	
	public void push(int data) {
		if(top==size-1) {
			System.out.println("overflow...");
		}
		arr[++top]=data;
	}
	

	
	public int pop() {
		if(top==-1) {
			System.out.println("underflow...");
			return -999;
		}
		return arr[top--];
	}


	
	
}









