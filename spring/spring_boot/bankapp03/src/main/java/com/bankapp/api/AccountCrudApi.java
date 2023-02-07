package com.bankapp.api;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.PersonalDetail;
import com.bankapp.entities.Account;
import com.bankapp.service.AccountService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "crud")
public class AccountCrudApi {
	
	final private AccountService accountService;
	
	@GetMapping(path = "accounts")
	public ResponseEntity<List<Account>> getAllAccounts(){
		return ResponseEntity.ok().body(accountService.getAllAccounts());
	}
	
	@GetMapping(path = "accounts/{id}")
	public ResponseEntity<Account> getAnAccount(@PathVariable int id){
		return ResponseEntity.ok().body(accountService.findByAccountId(id));
	}
	
	@PostMapping(path = "accounts")
	public ResponseEntity<Account> addAccount(@RequestBody  Account account) {
		accountService.saveAccount(account);
		return ResponseEntity.status(HttpStatus.CREATED).body(account);
	}
	
	
	@DeleteMapping(path = "accounts/{id}")
	public ResponseEntity<Void> deleteAnAccount(@PathVariable int id){
		accountService.deleteAccount(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@PutMapping(path = "accounts/{id}")
	public ResponseEntity<Account> updateAnAccount(@PathVariable int id,
			@RequestBody PersonalDetail personalDetail){
		Account updatedAccount=  accountService.updatePersonalDetails(id, personalDetail);
		
		return ResponseEntity.ok().body(updatedAccount);
	}
	

}












