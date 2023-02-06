package com.bankapp.service;

import java.util.List;

import com.bankapp.dao.Account;

public interface AccountService {
	public Account addAccount(Account account);
	public void deleteAccount(int accId);
	public Account updateAccount(Account account);
	public Account getById(int accId);
	
	public List<Account> getAllAccounts();
}
