package com.e.anno_ref;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//1. create a custom annotation
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	public String foo() default "foo value";
	public boolean isDone() default true;
}
//2. apply this annoation
class MyClass{
	@MyAnno
	void myMethod() {
		System.out.println("it is my method...");
	}
}
//3. u procees the annotation : using an core java api ie called "java reflection"
public class B_CustomAnnotation {

	public static void main(String[] args) throws ClassNotFoundException {
		//how to process that annotation at run time
		//NOte : Scope of annotatoin must be RUNTIME
		Class<?> clazz=Class.forName("com.b.anno_ref.MyClass");
		Method []methods=clazz.getDeclaredMethods();
		
		for(Method method: methods) {
			if(method.isAnnotationPresent(MyAnno.class)) {
				MyAnno anno=method.getAnnotation(MyAnno.class);
				System.out.println(anno.foo()+": "+ anno.isDone());
			}
		}
		System.out.println("----------------");
	}
	
}






