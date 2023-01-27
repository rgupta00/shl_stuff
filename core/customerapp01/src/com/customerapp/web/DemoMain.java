package com.customerapp.web;

import java.util.*;

import com.customerapp.dao.Customer;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;

public class DemoMain {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerServiceImpl();

		
		customerService.deleteCustomer(2);
		
		
//     	Customer customer=customerService.getById(2);
//     	customer.setAddress("Noida");
//     	customer.setPhone("756656666");
//     	
//     	customerService.updateCustomer(2, customer);
//     	
     	
     	
//		System.out.println(customer);
//		
		//List<Customer> customers = customerService.getAllCustomers();

		//customers.forEach(customer -> System.out.println(customer));

//		Customer customer = new Customer("indu", "chandigarth", "6505667666");
//		Customer customer2=customerService.addCustomer(customer);
//
//		System.out.println(customer2);
//		
//		System.out.println("--------------------");
//		customers = customerService.getAllCustomers();
//
//		customers.forEach(c -> System.out.println(c));
		
		
		

	}

}
















