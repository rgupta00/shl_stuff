package com.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.dto.CustomerDto;
import com.employee.repo.CustomerDao;
import com.employee.service.CustomerService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CustomerService customerService;
	
	private static Logger logger= LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		customerService.addCustomer(new CustomerDto("ravi"));
		customerService.addCustomer(new CustomerDto("sumit"));
		
		logger.info("customer are added...");
	
		CustomerDto customerDto=customerService.getCustomerById(1);
		logger.info(customerDto.toString());
	}

}
