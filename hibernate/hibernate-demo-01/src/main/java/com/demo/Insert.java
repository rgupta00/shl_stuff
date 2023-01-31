package com.demo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.factory.HibernateUtil;

public class Insert {

	public static void main(String[] args) {
		// I need to create something called SessionFactory
		// From sessionFactory i need to create Session

	
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session=sessionFactory.openSession();//openSession vs getCurrentSession
		
		//you need to start the tx
		
		Transaction tx = session.getTransaction();
		
		Customer customer=new Customer("sunit", "noida", "5600095494","seema@gmail.com");
		
		
		try {
			tx.begin();
			
			session.save(customer);
			
			tx.commit();
		}catch(HibernateException ex) {
			
			
			tx.rollback();
		}
		
		sessionFactory.close();
		session.close();
		
	}
}





