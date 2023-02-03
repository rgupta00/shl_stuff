package com.bankapp.service;

import java.util.List;

import com.bankapp.repository.Account;

public interface AccountService {
	
	public void transfer(int fromAccId, int toAccId, double amount);
	public void deposit(int accId, double amount);
	public void withdraw(int accId, double amount);
	
	public List<Account> getAllAccounts();
	public Account getById(int accId);
	
	public void updateAccount(Account account);
	
	public void addAccount(Account account);
	
	public void deleteAccount(int accId);
}
