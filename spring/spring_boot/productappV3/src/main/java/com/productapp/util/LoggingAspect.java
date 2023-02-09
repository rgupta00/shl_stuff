package com.productapp.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.productapp.service.ProductServiceImpl;

@Aspect
@Component
public class LoggingAspect {

	private Logger logger=LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Around("execution( * com.productapp.service..*Impl.*(..))")
	public Object calPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
		long start=System.currentTimeMillis();
		
		logger.info("logged is done");
		logger.info("--------------------");
		Object val=joinPoint.proceed();
		long end=System.currentTimeMillis();
		logger.info("time taken: "+ (end-start)+" ms");
		return val;
	}
}





