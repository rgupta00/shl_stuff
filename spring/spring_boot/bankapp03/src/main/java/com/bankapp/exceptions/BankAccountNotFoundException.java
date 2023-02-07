package com.bankapp.exceptions;

public class BankAccountNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public BankAccountNotFoundException(String message) {
		super(message);
	}

}
