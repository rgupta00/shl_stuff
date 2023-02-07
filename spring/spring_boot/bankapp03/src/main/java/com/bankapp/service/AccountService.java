package com.bankapp.service;
import java.math.BigDecimal;
import java.util.*;

import com.bankapp.dto.PersonalDetail;
import com.bankapp.entities.Account;
public interface AccountService {
	
	public List<Account> getAllAccounts();
	public Account saveAccount(Account account);
	
	public Account deleteAccount(int accId);
	
	public Account updatePersonalDetails(int accId,PersonalDetail personalDetail );
	
	public Account findByAccountId(int accId);

	
	public void transfer(int fromAccId, int toAccId, BigDecimal amount);
	
	public void deposit(int accId, BigDecimal amount);
	
	public void withdraw(int accId, BigDecimal amount);
	

}
