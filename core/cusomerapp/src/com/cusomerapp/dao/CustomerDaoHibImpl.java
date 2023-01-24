package com.cusomerapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.cusomerapp.exception.DataAccessException;
import com.cusomerapp.exception.HibernateException;

public class CustomerDaoHibImpl implements CustomerDao{

	@Override
	public List<Customer> getAllCustomers() {
		try {
			System.out.println("code done using hib: getAllCustomers");
			
			if(1==1)
				throw new HibernateException("some hib ex");
			return null;
		}catch (HibernateException e) {
			throw new DataAccessException(e);
		}
	}

	@Override
	public void addCustomer(Customer customer) {
		System.out.println("code done using jdbc: addCustomer");
	}

	@Override
	public Customer getById(int customerId) {
		System.out.println("code done using jdbc: getById");
		return null;
	}

}
