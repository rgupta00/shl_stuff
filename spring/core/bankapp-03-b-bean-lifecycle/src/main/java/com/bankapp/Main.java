package com.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		//Spring is a continer 
		AbstractApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		
		ctx.registerShutdownHook();
		
		Foo foo=ctx.getBean("foo",Foo.class);
		
		Foo foo2=ctx.getBean("foo",Foo.class);
		
		System.out.println(foo.hashCode());
		System.out.println(foo2.hashCode());
		
		foo.doWork();
		foo.doWork();
	}

}
