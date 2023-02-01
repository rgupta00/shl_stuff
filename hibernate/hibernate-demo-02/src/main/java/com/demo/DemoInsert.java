package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DemoInsert {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		//save tx
		
		Transaction tx=session.getTransaction();
		try {
			tx.begin();
			
			Customer customer=new Customer("hari", "noida", "566655666", "hari@gmail.com");
			
			Customer customer2=new Customer("amit", "delhi", "566655660", "amit@gmail.com");
			
			session.save(customer);
			session.save(customer2);
			
			tx.commit();
		}catch(HibernateException ex) {
			tx.rollback();
		}
		
		session.close();
		
		factory.close();
	}
}
