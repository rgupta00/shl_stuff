package com.backup;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Foo implements InitializingBean, DisposableBean {

	private String message;

	public Foo() {
		System.out.println("default ctr of Foo is called");
	}
	
	
	
	
	public void setMessage(String message) {
		System.out.println("setter of Foo is called");
		this.message = message;
	}
	
	//---life cycle method --
	public void myXmlInit() {
		System.out.println("init of Foo xml wala");
	}
	
	
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
	
	public void myXmlDestroy() {
		System.out.println("destroy of Foo xml wala");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("-interface wala--InitializingBean is called---");
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("-interface wala ---DisposableBean is called---");
	}
	
	
	
}
