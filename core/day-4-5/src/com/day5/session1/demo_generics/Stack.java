package com.day5.session1.demo_generics;

import java.lang.reflect.Array;

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

public class Stack<T extends Comparable<T>>{
	private T arr[];
	private int top;
	private int size=5;
	
	@SuppressWarnings("unchecked")
	public Stack(Class<T> clazz) {
		arr=(T[])Array.newInstance(clazz, size);//java reflection *
		top=-1;
	}
	
	public void push(T emp) {
		if(top==size-1) {
			throw new StackOverflowEx("stack is full");
		}
		arr[++top]=emp;
	}
	
	public T pop() {
		if(top==-1) {
			throw new StackUnderflowEx("stack is empty");
		}
		T e=arr[top];
		arr[top]=null;
		top--;
		return e;
	}
}









