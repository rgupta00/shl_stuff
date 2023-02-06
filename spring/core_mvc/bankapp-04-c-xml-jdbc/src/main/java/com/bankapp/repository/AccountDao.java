package com.bankapp.repository;
import java.util.*;
public interface AccountDao {
	public List<Account> getAllAccounts();
	public Account getById(int accId);
	public void updateAccount(Account account);
	public void addAccount(Account account);
	public void deleteAccount(int accId);
}
