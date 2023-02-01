package com.customerapp.service;

import java.util.List;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.dao.CustomerDaoHibImpl;
import com.customerapp.dao.CustomerDaoJdbcImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl() {
		customerDao=new CustomerDaoHibImpl();
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Override
	public Customer getById(int customerId) {
		return customerDao.getById(customerId);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerDao.addCustomer(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerDao.deleteCustomer(customerId);
	}

	@Override
	public void updateCustomer(int customerId, Customer customer) {
		customerDao.updateCustomer(customerId, customer);
	}

}
