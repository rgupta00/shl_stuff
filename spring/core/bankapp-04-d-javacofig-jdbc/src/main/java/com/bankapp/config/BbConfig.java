package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


//@Configuration
public class BbConfig {
	

	@Autowired
	private Environment env;
	
	
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setPassword(env.getProperty("jdbc.password"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		return  ds;
	}

}
