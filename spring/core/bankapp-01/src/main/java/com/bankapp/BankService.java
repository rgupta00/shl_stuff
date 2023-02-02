package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;

//SOLI D(DIP)  IOC--->DI
public class BankService {
	
	
	private MessagingService messagingService;


	public void setMessagingService(MessagingService messagingService) {
		this.messagingService = messagingService;
	}

	public void transfer(int fromAccId, int toAccId, double amount) {
		
		System.out.println("fund is transfer....");
		messagingService.sendMessage();
	}

}
