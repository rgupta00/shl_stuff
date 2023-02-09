package com.customerapp;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.customerapp.dto.CustomerDto;
import com.customerapp.entity.Customer;
import com.customerapp.repo.CustomerRepo;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepo customerRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerRepo.save
		(new Customer("amit@gmail.com", "amit kumar", LocalDate.of(1980, Month.FEBRUARY, 11)));
		customerRepo.save
		(new Customer("geeta@gmail.com", "geeta kumari", LocalDate.of(1987, Month.NOVEMBER, 11)));
		
		getByEmailId();
	}

	private void getByEmailId() {
			
		CustomerDto customerDto = customerRepo.findNameFromEmail("amit@gmail.com");
		
		System.out.println(customerDto.getName());
		System.out.println(customerDto.getEmailId());
	}

}
