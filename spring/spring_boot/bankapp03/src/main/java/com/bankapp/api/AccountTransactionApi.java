package com.bankapp.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.TransferDto;
import com.bankapp.service.AccountService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "transactions")
public class AccountTransactionApi {

	final private AccountService accountService;
	
	//transfer
	
	@PostMapping(path = "transfer")
	public ResponseEntity<String> transfer(@RequestBody  TransferDto transferDto){
		accountService.transfer(transferDto.getFromAccId(), transferDto.getToAccId(), transferDto.getAmount());
		return ResponseEntity.status(HttpStatus.OK).body("fund transfer happen successfully!");
	}
	
	//deposit
	
	//withdraw
}














