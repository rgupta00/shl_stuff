package com.cusomerapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.cusomerapp.exception.DataAccessException;
import com.cusomerapp.exception.HibernateException;

public class CustomerDaoJdbcImpl implements CustomerDao{

	@Override
	public List<Customer> getAllCustomers() {
		try {
			System.out.println("code done using jdbc: getAllCustomers");
			
			if(1==1)
				throw new SQLException();
			return null;
		}catch (SQLException e) {
			throw new DataAccessException(e);
		}
	}

	@Override
	public void addCustomer(Customer customer) {
		System.out.println("code done using hibernate: addCustomer");
	}

	@Override
	public Customer getById(int customerId) {
		System.out.println("code done using hibernate: getById");
		return null;
	}

}
