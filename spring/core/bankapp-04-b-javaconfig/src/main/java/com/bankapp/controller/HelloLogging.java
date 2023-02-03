package com.bankapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLogging {

	private static Logger logger=LoggerFactory.getLogger(HelloLogging.class);
	
	public static void main(String[] args) {
		logger.info("code is working till line 6....");

		try {
			String noString="121A";
			Integer val=Integer.parseInt(noString);
		}catch(Exception e) {
			logger.error("some no formate error");
		}
		
		logger.info("code is working till line 19....");
	}
}
