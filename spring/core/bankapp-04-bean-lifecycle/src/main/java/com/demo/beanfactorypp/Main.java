package com.demo.beanfactorypp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		//Spring is a continer 
		AbstractApplicationContext ctx=
				new ClassPathXmlApplicationContext("beanfactorypp.xml");
		
		Account account=ctx.getBean("account",Account.class);
		System.out.println(account);
		
		//acc.properties
	}

}
