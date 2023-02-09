package com.employee.repo;
import java.util.*;
import com.employee.dto.CustomerDto;
import com.employee.entities.Customer;

public interface CustomerDao {
	public CustomerDto getCustomerById(Integer customerId);
	public CustomerDto addCustomer(CustomerDto cutomer);
	
}
