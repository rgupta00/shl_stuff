package com.bankapp.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
@Repository
//@Primary
public class AccountDaoMapImpl implements AccountDao {

	private Map<Integer, Account> accouts = new HashMap<Integer, Account>();
	{
		accouts.put(1, new Account(1, "raja", 5000));
		accouts.put(2, new Account(2, "ravi", 5000));
	}

	@Override
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accouts.values());
	}

	@Override
	public Account getById(int accId) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {}
		return accouts.get(accId);
	}

	@Override
	public void updateAccount(Account account) {
		accouts.put(account.getId(), account);
	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAccount(int accId) {
		// TODO Auto-generated method stub

	}

}
