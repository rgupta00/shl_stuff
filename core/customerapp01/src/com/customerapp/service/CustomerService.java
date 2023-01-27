package com.customerapp.service;

import java.util.List;

import com.customerapp.dao.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomers();
	public Customer getById(int customerId);
	public Customer addCustomer(Customer customer);
	public void deleteCustomer(int customerId);
	public void updateCustomer(int customerId, Customer customer);
}
