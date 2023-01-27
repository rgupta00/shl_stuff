package com.customerapp.dao;
import java.util.*;
//----programmer is writing curd operation ....
//can crud op can be automized ....Spring boot : spring data : we just need to declare the curd opation

public interface CustomerDao {
	public List<Customer> getAllCustomers();
	public Customer getById(int customerId);
	public Customer addCustomer(Customer customer);
	public void deleteCustomer(int customerId);
	public void updateCustomer(int customerId, Customer customer);
}
