package com.bankapp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//<bean id="ms2" class="com.bankapp.SmsService"/>
@Component(value = "ms2")
@Profile("test")
public class SmsService implements MessagingService {

	public void sendMessage() {
		System.out.println("sms is send");
	}
}
