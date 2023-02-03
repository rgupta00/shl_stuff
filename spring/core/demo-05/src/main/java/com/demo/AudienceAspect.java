package com.demo;
//Aspect AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // Aspect = advice + pointcut?

@Component
public class AudienceAspect {

	@Around("execution(public String doMagic())")
	public Object clapping(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("magic start ho raha hey..");
		
		Object object= joinPoint.proceed();
		
		System.out.println("clapping ... maza aa gaya!");
		
		return object;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	// @AfterReturning("execution(public void doMagic())")
	// @AfterReturning("execution(public void doMagic())")
//  @After("execution(public void doMagic())")
//	@Before("execution(public void doMagic())")

//	@AfterThrowing(pointcut = "execution(public void doMagic())", throwing = "ex")
//	public void callTheDr(GetIllEx ex) {
//		System.out.println(ex.getMessage());
//	}

	//@AfterReturning("execution(public void doMagic())")
	

//	@Pointcut("execution(public void doMagic())")
//	public void foo() {}
//	
//	@After("foo()")
//    public void clapping(){
//        System.out.println("clapping ... maza aa gaya!");
//    }
//	

}










