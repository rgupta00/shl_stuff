package com.bankapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "emailService")
@Primary
public class EmailService implements MessagingService {

	public void sendMessage() {
		System.out.println("email is send");
	}
}
