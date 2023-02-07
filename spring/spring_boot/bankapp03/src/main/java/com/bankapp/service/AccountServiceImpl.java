package com.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankapp.dto.PersonalDetail;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.repo.AccountRepo;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

	final private AccountRepo accountRepo;

	@Override
	public List<Account> getAllAccounts() {
		return accountRepo.findAll();
	}

	@Override
	public Account saveAccount(Account account) {
		accountRepo.save(account);
		return null;
	}

	@Override
	public Account deleteAccount(int accId) {
		Account accountToDelete = findByAccountId(accId);
		accountRepo.delete(accountToDelete);

		return accountToDelete;
	}

	@Override
	public Account updatePersonalDetails(int accId, PersonalDetail personalDetail) {

		Account accountToUpdate = findByAccountId(accId);

		accountToUpdate.setAddress(personalDetail.getAddress());
		accountToUpdate.setPhone(personalDetail.getPhone());

		accountRepo.save(accountToUpdate);// same for update and add new records :)

		return accountToUpdate;
	}

	@Override
	public Account findByAccountId(int accId) {
		return accountRepo.findById(accId)
				.orElseThrow(() -> new BankAccountNotFoundException("acc with id " + accId + " is not found"));

	}

	@Override
	public void transfer(int fromAccId, int toAccId, BigDecimal amount) {
		Account fromAcc = findByAccountId(fromAccId);
		Account toAcc = findByAccountId(toAccId);

		fromAcc.setBalance(fromAcc.getBalance().subtract(amount));

		toAcc.setBalance(toAcc.getBalance().add(amount));

		accountRepo.save(fromAcc);
		accountRepo.save(toAcc);
	}

	@Override
	public void deposit(int accId, BigDecimal amount) {
		Account account = findByAccountId(accId);

		account.setBalance(account.getBalance().add(amount));

		accountRepo.save(account);

	}

	@Override
	public void withdraw(int accId, BigDecimal amount) {
		Account account = findByAccountId(accId);
		account.setBalance(account.getBalance().subtract(amount));
		accountRepo.save(account);

	}

}
