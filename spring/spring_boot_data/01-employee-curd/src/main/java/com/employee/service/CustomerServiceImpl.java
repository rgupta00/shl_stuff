package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dto.CustomerDto;
import com.employee.repo.CustomerDao;
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public CustomerDto addCustomer(CustomerDto cutomer) {
		//cross cutting concern== we can apply to service layer
		return customerDao.addCustomer(cutomer);
	}

	@Override
	public CustomerDto getCustomerById(Integer customerId) {
		return customerDao.getCustomerById(customerId);
	}

}







