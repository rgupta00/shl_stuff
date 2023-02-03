package com.bankapp;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component(value = "ms1")
@Profile("dev")
public class EmailService implements MessagingService {

	public void sendMessage() {
		System.out.println("email is send");
	}
}
