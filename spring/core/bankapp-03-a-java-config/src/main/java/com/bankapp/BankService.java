package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//SOLI D(DIP)  IOC--->DI


@Component(value = "bankservice")
public class BankService {
	

	private MessagingService messagingService;


	@Autowired
	public void setMessagingService(MessagingService messagingService) {
		this.messagingService = messagingService;
	}

	public void transfer(int fromAccId, int toAccId, double amount) {
		
		System.out.println("fund is transfer....");
		messagingService.sendMessage();
	}

}
