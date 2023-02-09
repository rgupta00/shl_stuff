package com.employee.service;

import com.employee.dto.CustomerDto;

public interface CustomerService {
	public CustomerDto addCustomer(CustomerDto cutomer);
	public CustomerDto getCustomerById(Integer customerId);
}
