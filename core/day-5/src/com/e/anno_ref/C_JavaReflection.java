package com.e.anno_ref;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class C_JavaReflection {

	public static void main(String[] args) throws ClassNotFoundException {
		
		/*Reflection is an API which is used to examine the behavior of methods, classes, 
		 *  interfaces at runtime. The required classes 
		 *  for reflection are provided under java. lang. reflect package.
		 * 
		 */
		/*
		 * static vs dynamic class loading
		 * 
		 */
		//static class loading
		Employee employee=new Employee(1, "raj", 590000);
		//dynamic class loading
		//Class is a class in java which hold meta data of the class , ie can be access by using reflection api
		Class<?> class1=Class.forName("com.b.anno_ref.Employee");
		
		Class<?> class2=employee.getClass();
		
		Class<?> class3=Employee.class;
		
		//what is that information about the class: Class have all the janampatri?
		Method[] methods=class1.getDeclaredMethods();
		for(Method method: methods) {
			System.out.println(method.getModifiers()+": "+ method.getName()+" :"+Modifier.toString(method.getModifiers()));
		}
		
	}
}
