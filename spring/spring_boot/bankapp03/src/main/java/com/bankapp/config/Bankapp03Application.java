package com.bankapp.config;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.bankapp.dto.PersonalDetail;
import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bankapp"})
@EntityScan("com.bankapp.entities")
@EnableJpaRepositories("com.bankapp.repo")
public class Bankapp03Application{
	
	@Autowired
	private AccountService accountService;
	

	public static void main(String[] args) {
		SpringApplication.run(Bankapp03Application.class, args);
		
	
		
	}

	@Bean
	public CommandLineRunner getRunnner() {
		return (String... args2)->{
//			accountService.saveAccount(new Account("sumit", new BigDecimal(2000.00), "6565656656", "delhi"));
//			accountService.saveAccount(new Account("amit", new BigDecimal(2500.00), "6505656656", "banglore"));
//			
//			
			
			System.out.println("-------------------");
			
		};
	}

}
