package com.bankapp.basics;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bankapp.factory.HibernateSessionFactory;

public class AddAccount {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.getTransaction();
		try {
			tx.begin();

			tx.commit();
		} catch (HibernateException ex) {

			tx.rollback();
		}

		sessionFactory.close();
		session.close();

	}

}
