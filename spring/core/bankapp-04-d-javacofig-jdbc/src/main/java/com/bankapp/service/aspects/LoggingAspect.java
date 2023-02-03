package com.bankapp.service.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.bankapp.service.impl.AccountServiceImpl;

@Aspect
@Component
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

	
	@Around("@annotation(MyAppLogger)")
	public Object aroundLogging(ProceedingJoinPoint joinPoint) throws Throwable {

		long start = System.currentTimeMillis();

		Object ob=joinPoint.proceed();

		long end = System.currentTimeMillis();

		logger.info("time taken to execute " +joinPoint.getSignature().getName() + (end - start) + " ms");
		 return ob;

	}
	
	

	
	
	@AfterThrowing(pointcut = "execution( * com.bankapp.service..*.*(..))", throwing = "ex")
	public void aroundLogging(Exception ex) {
	
		logger.error(ex.getMessage());
	}

	
	
	
//	@Around("execution(public void transfer(..))")
	
//	@Pointcut("execution( * com.bankapp.service..*.*(..))")
//	public void anyMethodOfServiceLayer() {}
//	
//	@Around("anyMethodOfServiceLayer()")
//	public Object aroundLogging(ProceedingJoinPoint joinPoint) throws Throwable {
//
//		long start = System.currentTimeMillis();
//
//		Object ob=joinPoint.proceed();
//
//		long end = System.currentTimeMillis();
//
//		logger.info("time taken to execute " +joinPoint.getSignature().getName() + (end - start) + " ms");
//		 return ob;
//
//	}

}
