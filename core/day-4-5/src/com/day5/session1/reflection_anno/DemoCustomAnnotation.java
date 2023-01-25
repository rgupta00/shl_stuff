package com.day5.session1.reflection_anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

import javax.sound.midi.Soundbank;

//-------1. craeate the anno

@Documented	//*
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
	public String hello() default "champ";
	public boolean isDone() default true;
}

//you apply them into ur code
class MyDemo{
	
	@MyAnno(hello = "all champs", isDone = true)
	public void demo() {
		System.out.println("hello to all chmaps it is demo method ...");
	}
}

//they have written the code to process that anno using java reflection

public class DemoCustomAnnotation {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//how to process the annotation : using java reflection
		Class<?> class1=Class.forName("com.day5.session1.reflection_anno.MyDemo");
		
		Method[]methods=class1.getDeclaredMethods();
		for(Method method: methods) {
			if(method.isAnnotationPresent(MyAnno.class)) {
				MyAnno anno=method.getAnnotation(MyAnno.class);
				System.out.println(anno.isDone()+" : "+ anno.hello());
			}
		}
		
	}

}










