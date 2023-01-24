package com.cusomerapp.service;

import java.util.List;

import com.cusomerapp.dao.Customer;
import com.cusomerapp.exception.DataAccessException;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public void addCustomer(Customer customer);
	public Customer getById(int customerId);

}
