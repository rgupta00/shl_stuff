package com.c.juc_collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class DemoCollection {
	
	public static void main(String[] args) {
		//java 1.4 : we dont have best way to put data into a container ie thread safe
		
		//Vector<E>
		//Hashtable<K, V>
	//	Map<String, Integer> map=Collections.synchronizedMap(new HashMap<String, Integer>());
		//ConcurrentHashMap<String, Integer>
		//fail fast in collection* ConcurrentModificationException
	}

}
