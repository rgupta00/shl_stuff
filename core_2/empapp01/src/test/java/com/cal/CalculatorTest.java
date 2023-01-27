package com.cal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {


	private Calculator calculator;
	
	@BeforeClass
	public static void preAll() {
		System.out.println("-------------going to call only once---------");
	}
	
	
	@Before
	public void pre() {
		System.out.println("going to call before every test case");
		calculator=new Calculator();
	}
	@Test
	public void addTest() {
		System.out.println("--------addTest------------");
		calculator=new Calculator();
		Assert.assertEquals(4, calculator.add(1, 3));
		calculator=null;
		
	}
	
	@Test
	public void divideTest() {
		System.out.println("--------divideTest------------");
		calculator=new Calculator();
		Assert.assertEquals(3, calculator.divide(6,2));
		calculator=null;
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideTestWithException() {
		System.out.println("--------divideTestWithException------------");
		calculator=new Calculator();
		Assert.assertEquals(3, calculator.divide(6,0));
		
		calculator=null;
		
	}
	
	@After
	public void after() {
		System.out.println("going to call after every test case");
		calculator=null;
	}
	
	@AfterClass
	public static void preAllAfter() {
		System.out.println("-------------going to call only once---------");
	}
	

}
