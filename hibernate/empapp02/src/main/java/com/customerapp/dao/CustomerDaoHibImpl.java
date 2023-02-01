package com.customerapp.dao;

import java.util.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.customerapp.exceptions.ResourceNotFoundException;
import com.customerapp.factories.HibernateUtil;

public class CustomerDaoHibImpl implements CustomerDao {

	private SessionFactory sessionFactory;
	
	
	
	public CustomerDaoHibImpl() {
		sessionFactory=HibernateUtil.getSessionFactory();
	}

	@Override
	public List<Customer> getAllCustomers() {
		Session session=sessionFactory.openSession();
		List<Customer> customers=session.createQuery("select c from Customer c", Customer.class).getResultList();
		session.close();
		return customers;
	}

	@Override
	public Customer getById(int customerId) {
		Session session=sessionFactory.openSession();
		Customer customer=session.get(Customer.class, customerId);
		if (customer == null)
			throw new ResourceNotFoundException("customer with id " + customerId + " is not found");
		
		session.close();
		return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			tx.begin();
			session.save(customer);
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
		}
		session.close();
		
		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		Customer customerToDelete=getById(customerId);
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			tx.begin();
			session.remove(customerToDelete);
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
		}
		session.close();
		
		
	}

	@Override
	public void updateCustomer(int customerId, Customer customer) {
		
	    Customer customerToUpdate=getById(customerId);
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		try {
			tx.begin();
			customerToUpdate.setAddress(customer.getAddress());
			customerToUpdate.setPhone(customer.getPhone());
			
			session.update(customerToUpdate);
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
		}
		session.close();	
	}
}










