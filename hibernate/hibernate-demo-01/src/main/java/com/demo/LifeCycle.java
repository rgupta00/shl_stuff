package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.HibernateUtil;

public class LifeCycle {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();// openSession vs getCurrentSession

		// you need to start the tx

		Transaction tx = session.getTransaction();

		// transient
		// get vs load Proxy design pattern: RMI, EJB
		System.out.println("---------------");
		Customer customer = session.load(Customer.class, 5);//eager loading
		System.out.println("---------------");
	
		session.close();

		System.out.println(customer);
		
		
		sessionFactory.close();
		

//		try {
//			tx.begin();
//			customer.setAddress("bang");
//			session.update(customer);
//			tx.commit();
//		}catch(HibernateException ex) {
//			
//			tx.rollback();
//		}
//		
//
//		System.out.println(customer);
//		//session.evict(customer);
//		
//		// get vs load
//		Customer customer2 = session.get(Customer.class, 5);// get vs load
//
//		System.out.println(customer2);

		
		// detached

	}

}
