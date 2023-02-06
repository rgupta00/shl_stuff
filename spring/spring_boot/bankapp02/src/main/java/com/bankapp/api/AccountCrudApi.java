package com.bankapp.api;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;

@RestController
public class AccountCrudApi {
	
	private AccountService accountService;

	@Autowired
	public AccountCrudApi(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@GetMapping(path = "accounts")
	public List<Account>getAllAccounts(){
		return accountService.getAllAccounts();
	}
	
//	@PostMapping(path = "accounts")
//	public Account addAccount(@RequestBody  Account account) {
//		return accountService.addAccount(account);
//	}
	
	@PostMapping(path = "accounts")
	public ResponseEntity<Account> addAccount(@RequestBody  Account account) {
		return  ResponseEntity.status(HttpStatus.CREATED).body(accountService.addAccount(account));
	}
	

}










