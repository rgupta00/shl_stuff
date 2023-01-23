package com.day3.session2.demo_memoryleak;
//raj
class StackOverflowEx extends RuntimeException{

	public StackOverflowEx(String message) {
		super(message);
	}
}
class StackUnderflowEx extends RuntimeException{
	public StackUnderflowEx(String message) {
		super(message);
	}
}

public class Stack{
	private Emp arr[];
	private int top;
	private int size=5;
	
	public Stack() {
		arr=new Emp[size];
		top=-1;
	}
	
	public void push(Emp emp) {
		if(top==size-1) {
			throw new StackOverflowEx("stack is full");
		}
		arr[++top]=emp;
	}
	
	public Emp pop() {
		if(top==-1) {
			throw new StackUnderflowEx("stack is empty");
		}
		Emp e=arr[top];
		arr[top]=null;
		top--;
		return e;
	}
}









