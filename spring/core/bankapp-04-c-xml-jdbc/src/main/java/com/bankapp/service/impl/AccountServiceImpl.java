package com.bankapp.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repository.Account;
import com.bankapp.repository.AccountDao;
import com.bankapp.service.AccountService;
import com.bankapp.service.aspects.MyAppLogger;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	
	
	
	@Autowired
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@MyAppLogger
	@Override
	public void transfer(int fromAccId, int toAccId, double amount) {
		Account fromAcc=accountDao.getById(fromAccId);
		Account toAcc=accountDao.getById(toAccId);
		
		fromAcc.setBalance(fromAcc.getBalance()-amount);
		toAcc.setBalance(toAcc.getBalance()+amount);
		
		accountDao.updateAccount(fromAcc);
		accountDao.updateAccount(toAcc);
	}

	@Override
	public void deposit(int accId, double amount) {
		Account acc=accountDao.getById(accId);
		acc.setBalance(acc.getBalance()+amount);
		accountDao.updateAccount(acc);
		
		System.out.println("deposit is done");
	}

	
	@MyAppLogger
	@Override
	public void withdraw(int accId, double amount) {
		Account acc=accountDao.getById(accId);
		acc.setBalance(acc.getBalance()-amount);
		accountDao.updateAccount(acc);
		
		System.out.println("withdraw is done");
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountDao.getAllAccounts();
	}

	@Override
	public Account getById(int accId) {
		Account account= accountDao.getById(accId);
		if(account==null)
			throw new BankAccountNotFoundException("account with id "+ accId+" is not found");
		
		return account;
	}

	@Override
	public void updateAccount(Account account) {
		accountDao.updateAccount(account);
	}

	@Override
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}

	@Override
	public void deleteAccount(int accId) {
		accountDao.deleteAccount(accId);
	}

}
