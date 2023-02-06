package com.bankapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@PropertySource("classpath:db.properties")
@Configuration
public class BbConfigV2 {
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Value("${jdbc.driver}")
	private String driver;
	
	
	
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setUrl(url);
		ds.setPassword(password);
		ds.setUsername(username);
		ds.setDriverClassName(driver);
		return  ds;
	}

}
