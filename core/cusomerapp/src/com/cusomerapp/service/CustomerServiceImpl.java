package com.cusomerapp.service;

import java.sql.SQLException;
import java.util.List;

import com.cusomerapp.dao.Customer;
import com.cusomerapp.dao.CustomerDao;
import com.cusomerapp.dao.CustomerDaoHibImpl;
import com.cusomerapp.dao.CustomerDaoJdbcImpl;
import com.cusomerapp.exception.HibernateException;

public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao= new CustomerDaoJdbcImpl();
	
	@Override
	public List<Customer> getAllCustomers() {
		//we can some sone NFR code here *
		return customerDao.getAllCustomers();
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Override
	public Customer getById(int customerId) {
		return customerDao.getById(customerId);
	}

}
