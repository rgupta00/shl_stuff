package com.demo;

import java.util.ArrayList;
import java.util.LinkedList;
//FIFO
import java.util.List;

//public class Queue<String> extends LinkedList<String>{
//	
//	//use LinkedList to create for Queue
//}

public class Queue<String>{
	private LinkedList<String> list=new LinkedList<String>();
	//use LinkedList to create for Queue
	public void insert(String element) {
		list.addLast(element);
	}
}

