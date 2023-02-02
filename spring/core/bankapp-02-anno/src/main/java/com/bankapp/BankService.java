package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//SOLI D(DIP)  IOC--->DI


@Component(value = "bankservice")
public class BankService {
	

	@Autowired
	@Qualifier(value = "emailService")
	private MessagingService messagingServiceEmail;

	@Autowired
	@Qualifier(value = "smsService")
	private MessagingService messagingServiceSms;
	


	public void transfer(int fromAccId, int toAccId, double amount) {
		
		System.out.println("fund is transfer....");
		messagingServiceEmail.sendMessage();
		messagingServiceSms.sendMessage();
	}

}
