package com.bankapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Foo {

	private String message;

	public Foo() {
		System.out.println("ctr of Foo is called");
	}
	
	
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	//BeanPostProcessor
	
	
	@PostConstruct
	public void myAnnoInit() {
		System.out.println("init of Foo anno wala");
	}
	
	

	@PreDestroy
	public void myAnnoDestory() {
		System.out.println("destroy of Foo anno wala");
	}
	

	public void doWork() {
		System.out.println("bean is doing work..");
	}
	
	

	
}
