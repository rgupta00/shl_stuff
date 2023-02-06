package com.bankapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class AccountDaoImpl implements AccountDao{

	@Override
	public List<Account> getAllAccounts() {
		return List.of(new Account(1,"amit",3000),new Account(3,"sumit",3700));
	}

}
