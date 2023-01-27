package com.cal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SlowApiTest {

	
	private SlowApi slowApi;
	
	@Before
	public void setUp() throws Exception {
		slowApi=new SlowApi();
	}
	
	@Test(timeout = 4000)
	public void test() {
		Assert.assertEquals("rai pur", slowApi.getCityName(22));
	}
	

	@After
	public void tearDown() throws Exception {
		slowApi=null;
	}



}
