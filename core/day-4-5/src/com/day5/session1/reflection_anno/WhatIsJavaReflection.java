package com.day5.session1.reflection_anno;

import java.lang.reflect.*;

class MySingleton{
	private static MySingleton mySingleton=new MySingleton();
	
	private MySingleton() {
		System.out.println("dare to call me");
	}
	public static MySingleton getMySingleton() {
		return mySingleton;
	}
}
public class WhatIsJavaReflection {
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		MySingleton mySingleton=MySingleton.getMySingleton();
		System.out.println(mySingleton.hashCode());
		
//		MySingleton mySingleton2=MySingleton.getMySingleton();
//		System.out.println(mySingleton2.hashCode());
		
		Class<?>class1=Class.forName("com.day5.session1.reflection_anno.MySingleton");
		
		Constructor[]constructors=class1.getDeclaredConstructors();
		
		constructors[0].setAccessible(true);
		
		MySingleton mySingleton2=(MySingleton) constructors[0].newInstance();
		System.out.println(mySingleton2.hashCode());
		
		
		//static class loading
		//Emp emp=new Emp(1,"raj");
		
//		//Dynamic class loading
//		Class<?>clazz=Class.forName("com.day5.session1.demo_generics.Emp");
//		
//		Method[]methods=clazz.getMethods();
//		for(Method method: methods) {
//			System.out.println(method.getName()+": "+ Modifier.toString(method.getModifiers()));
//			
//		}
//		
//		Class<?> interfaces[] = clazz.getInterfaces();
		
		
		
	}

}
