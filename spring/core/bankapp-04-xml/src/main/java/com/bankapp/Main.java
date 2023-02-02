package com.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		//Spring is a continer 
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("beans.xml");
		
		BankService bankService=(BankService) ctx.getBean("bankservice");
		bankService.transfer(1, 2, 10);
		
	}

}
