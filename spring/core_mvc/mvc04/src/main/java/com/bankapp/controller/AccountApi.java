package com.bankapp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;


@RestController   //@Controller+@ResponseBody
public class AccountApi {
	
	private AccountService accountService;

	@Autowired
	public AccountApi(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@GetMapping(path = "accounts")
	public List<Account> getAllAccounts(){
		return accountService.getAllAccounts();
	}
	

}
