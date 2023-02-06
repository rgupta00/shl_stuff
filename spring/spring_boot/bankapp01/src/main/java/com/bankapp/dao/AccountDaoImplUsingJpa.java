package com.bankapp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@Primary
@AllArgsConstructor
public class AccountDaoImplUsingJpa implements AccountDao {

	final private EntityManager em;

	@Override
	public List<Account> getAllAccounts() {
		System.out.println("---jpa wala---");
		return em.createQuery("select a from Account a", Account.class).getResultList();
	}

}











