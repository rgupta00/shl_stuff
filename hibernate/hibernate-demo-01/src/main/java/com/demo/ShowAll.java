package com.demo;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.factory.HibernateUtil;


public class ShowAll {

	public static void main(String[] args) {
		// I need to create something called SessionFactory
		// From sessionFactory i need to create Session

	
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session=sessionFactory.openSession();//openSession vs getCurrentSession
		
		//SQL vs HQL
//		List<Customer> customers=session
//				.createQuery("select c from Customer c",Customer.class).getResultList();
//		customers.forEach(c-> System.out.println(c));
		
//		List<Object[]> customers=session
//				.createQuery("select c.name, c.phone from Customer c",Object[].class).getResultList();
//		
//		
//		for(Object[]obArray: customers) {
//			System.out.println(obArray[0]+" : "+ obArray[1]);
//		}
//		
		
		List<CustomerData> customersData=session
				.createQuery("select new com.demo.CustomerData( c.name, c.phone) from Customer c",CustomerData.class).getResultList();
		
		
		customersData.forEach(c-> System.out.println(c));
		
		sessionFactory.close();
		session.close();
		
	}
}





