package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("demo.xml");
		
		Magician magician=ctx.getBean("magician",Magician.class);
		
		String val= magician.doMagic();
		
		System.out.println(val);
		//magician.doEat();
	}

}
