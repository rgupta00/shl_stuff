package com.customerapp.factories;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	static StandardServiceRegistry serviceRegistry=null;
	static SessionFactory sessionFactory=null;
	static {
		 serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();
		 
		 sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
	}

	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
