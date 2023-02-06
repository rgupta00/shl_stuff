package com.bankapp.dto;

import java.math.BigDecimal;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {

	private int id;
	
	@NotNull(message = "{account.name.absent}")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{account.name.invalid}")
	private String name;
	
	@NotNull(message = "{account.balance.absent}")
	@Range(min = 100, max = 100000, message = "{account.balance.invalid}")
	private BigDecimal balance;

	@Email(message = "{account.email.invalid}")
	@NotNull(message = "{account.email.absent}")
	private String email;
	

	@NotNull(message = "{account.phone.absent}")
	@Pattern(regexp = "[789][0-9]{9}", message = "{account.phone.invalid}")
	private String phone;
	
	public AccountDto(String name, BigDecimal balance, String email, String phone) {
		this.name = name;
		this.balance = balance;
		this.email = email;
		this.phone = phone;
	}
	
	
}
