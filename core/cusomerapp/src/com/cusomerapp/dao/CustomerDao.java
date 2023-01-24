package com.cusomerapp.dao;
import java.sql.SQLException;
import java.util.*;

import com.cusomerapp.exception.DataAccessException;
import com.cusomerapp.exception.HibernateException;

//Ravi
public interface CustomerDao {
	public List<Customer> getAllCustomers() throws DataAccessException;
	public void addCustomer(Customer customer);
	public Customer getById(int customerId);
}
