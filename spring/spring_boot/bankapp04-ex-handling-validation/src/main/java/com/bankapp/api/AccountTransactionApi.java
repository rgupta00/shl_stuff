package com.bankapp.api;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.service.AccountService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "transactions")
public class AccountTransactionApi {

	final private AccountService accountService;
	
	final private Environment environment;
	
	
	//transfer
	
	@PostMapping(path = "transfer")
	public ResponseEntity<String> transfer(@RequestBody  TransferDto transferDto){
		accountService.transfer(transferDto.getFromAccId(), transferDto.getToAccId(), transferDto.getAmount());
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(environment.getProperty("UserInterface.TRANSFER_SUCCESS"));
	}
	
	//deposit
	@PostMapping(path = "withdraw")
	public ResponseEntity<String> withdraw(@RequestBody  WithdrawDto withdrawDto){
		accountService.withdraw(withdrawDto.getAccId(), withdrawDto.getAmount());
		return ResponseEntity.status(HttpStatus.OK).body("fund withdraw happen successfully!");
	}
	
	//withdraw
	@PostMapping(path = "deposit")
	public ResponseEntity<String> deposit(@RequestBody  DepositDto depositDto){
		accountService.deposit(depositDto.getAccId(), depositDto.getAmount());
		return ResponseEntity.status(HttpStatus.OK).body("fund deposit happen successfully!");
	}
}














