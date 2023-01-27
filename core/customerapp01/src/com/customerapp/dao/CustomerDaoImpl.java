package com.customerapp.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.customerapp.exceptions.ResourceNotFoundException;
//Passanger ---Car

public class CustomerDaoImpl implements CustomerDao {

	private Connection connection;

	public CustomerDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		try {
			PreparedStatement stmt = connection.prepareStatement("select * from customer");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}

	@Override
	public Customer getById(int customerId) {

		Customer customer = null;

		try {
			PreparedStatement stmt = connection.prepareStatement("select * from customer where id=?");
			stmt.setInt(1, customerId);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (customer == null)
			throw new ResourceNotFoundException("customer with id " + customerId + " is not found");
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {

		// What is want : when db hit, auto gen id is create

		//String name = "'ravi' or delete from customer";

		try {

			PreparedStatement pstmt = connection.prepareStatement(
					"insert into customer(name, address, phone) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setString(3, customer.getPhone());

			int noOfRows = pstmt.executeUpdate();

			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				customer.setId(rs.getInt(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		try {

			PreparedStatement pstmt = connection.prepareStatement("delete from customer where id=?");
			pstmt.setInt(1, customerId);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateCustomer(int customerId, Customer customer) {
		try {

			PreparedStatement pstmt = connection.prepareStatement("update customer set address=?, phone=? where id=?");
			pstmt.setString(1, customer.getAddress());
			pstmt.setString(2, customer.getPhone());
			pstmt.setInt(3, customerId);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
