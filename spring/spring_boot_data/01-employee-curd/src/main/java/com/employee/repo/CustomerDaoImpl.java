package com.employee.repo;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.dto.CustomerDto;
import com.employee.entities.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private EntityManager em;
	
	@Override
	public CustomerDto addCustomer(CustomerDto cutomerDto) {
		//CustomerDto ------------- Customer
		//what i need to do? i need to copy data from CustomerDao to Customer
		Customer customer=new Customer();
		customer.setCustomerName(cutomerDto.getCustomerName());
		
		em.persist(customer);// good point is that u dont have to tx mgt spring can help in service layer
		
		cutomerDto.setCustomerId(customer.getCustomerId());
		return cutomerDto;
	}

	@Override
	public CustomerDto getCustomerById(Integer customerId) {
		Customer customer=em.find(Customer.class, customerId);
		
		//i need to convert customer to customerDto
		CustomerDto customerDto=new CustomerDto();
		customerDto.setCustomerId(customer.getCustomerId());
		customerDto.setCustomerName(customer.getCustomerName());
		return customerDto;
	}

}
