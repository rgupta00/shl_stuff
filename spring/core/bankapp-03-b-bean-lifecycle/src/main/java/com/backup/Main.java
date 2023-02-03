package com.backup;

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
		
		foo.doWork();
		foo.doWork();
	}

}
