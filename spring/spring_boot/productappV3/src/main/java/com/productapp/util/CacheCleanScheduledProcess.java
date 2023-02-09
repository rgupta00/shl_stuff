package com.productapp.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.productapp.service.ProductService;

@Service
public class CacheCleanScheduledProcess {
	private Logger logger = LoggerFactory.getLogger(CacheCleanScheduledProcess.class);
	
	@Autowired
	private ProductService productService;
	@Scheduled(initialDelay = 5000, fixedRate = 2000)
	public void fixedRateJob() {
		logger.info("> fixedRateJob");

		productService.cleanCache();
		
		logger.info("< fixedRateJob");
	}
}
