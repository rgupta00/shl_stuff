package com.bankapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.repository.Account;
import com.bankapp.service.AccountService;

public class Main {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("banks.xml");
		
		AccountService accountService=ctx.getBean("accountService",AccountService.class);
		
		List<Account> accounts=accountService.getAllAccounts();
		accounts.forEach(a-> System.out.println(a));
		
		accountService.transfer(1, 2, 100);
		System.out.println("---------------------------------");
		accounts=accountService.getAllAccounts();
		accounts.forEach(a-> System.out.println(a));
		
		ctx.close();
		
	}

}
