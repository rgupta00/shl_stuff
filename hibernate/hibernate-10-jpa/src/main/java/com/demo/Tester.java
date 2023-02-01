package com.demo;

import java.util.Date;
import java.util.List;

import javax.persistence.*;
public class Tester {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shl_training");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction tx=em.getTransaction();
		try {
			tx.begin();
			
			Book book=new Book("MAQ23", "rich dad poor dad", "abc", new Date(), 500);
			book.setBookType(BookType.MGT);
			em.persist(book);
			tx.commit();
		}catch(Exception e) {
			tx.rollback();
		}
			
		em.close();
		emf.close();

	}
}














