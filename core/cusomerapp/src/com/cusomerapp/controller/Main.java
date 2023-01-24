package com.cusomerapp.controller;

import java.sql.SQLException;
import java.util.List;

import com.cusomerapp.dao.Customer;
import com.cusomerapp.exception.DataAccessException;
import com.cusomerapp.exception.HibernateException;
import com.cusomerapp.service.CustomerService;
import com.cusomerapp.service.CustomerServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		CustomerService customerService=new CustomerServiceImpl();
		try{
			List<Customer> customers=customerService.getAllCustomers();
		}catch (DataAccessException e) {
			System.out.println(e.getCause());
		}
		
	}

}
