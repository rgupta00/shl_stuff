package com.bankapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService{
	
	final private AccountRepo accountRepo;

	@Override
	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
	}

	@Override
	public Account addAccount(Account account) {
		 accountRepo.save(account);
		 return account;
	}

	@Override
	public void deleteAccount(int accId) {
	
	}

	@Override
	public Account updateAccount(Account account) {
		
		return null;
	}

	@Override
	public Account getById(int accId) {
	
		return null;
	}
	
	
}
