package com.bankapp;

import org.springframework.stereotype.Component;

//<bean id="ms2" class="com.bankapp.SmsService"/>
@Component(value = "smsService")
public class SmsService implements MessagingService {

	public void sendMessage() {
		System.out.println("sms is send");
	}
}
