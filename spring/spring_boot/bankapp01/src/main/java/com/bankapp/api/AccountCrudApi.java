package com.bankapp.api;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	

}










