package com.demo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.factory.HibernateUtil;

public class Update {

	public static void main(String[] args) {
		// I need to create something called SessionFactory
		// From sessionFactory i need to create Session

	
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session=sessionFactory.openSession();//openSession vs getCurrentSession
		
		//you need to start the tx
		
		Transaction tx = session.getTransaction();
		
		//get the customer
		
		
		try {
			tx.begin();
			
			Customer customer=session.get(Customer.class, 1);
			if(customer!=null) {
				customer.setAddress("NY");
				session.update(customer);
			}else {
				System.out.println("customer is not found");
			}
			
			tx.commit();
		}catch(HibernateException ex) {
			
			
			tx.rollback();
		}
		
		sessionFactory.close();
		session.close();
		
	}
}





