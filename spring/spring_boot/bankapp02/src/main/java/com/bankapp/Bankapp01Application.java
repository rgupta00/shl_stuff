package com.bankapp;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Bankapp01Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EntityManager em;

	public static void main(String[] args) {

		// i want to see list of bean configure under the hood
		ApplicationContext ctx = SpringApplication.run(Bankapp01Application.class, args);

//		String beanNames[]=ctx.getBeanDefinitionNames();
//		for(String bean: beanNames) {
//			System.out.println(bean);
//		}

	

	}

	@Override
	public void run(String... args) throws Exception {
		if (jdbcTemplate != null)
			System.out.println("jdbc template is configured..");

		if (em != null)
			System.out.println("hibernate and spring  is configured..");

	}

}
