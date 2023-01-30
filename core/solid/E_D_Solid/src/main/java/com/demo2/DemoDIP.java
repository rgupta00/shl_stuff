package com.demo2;
//DIP: dependeny Inversion prin
//DI: Spring Dependeny injection
//IOC: inversion of control DI is aka IOC


//LLM					LLM

//BankService----->SmsService

//BankService--->MessagingService<------SmsService
//								<-------EmailService

interface MessagingService{
	public boolean send(String message);
}


class SmsService implements MessagingService{
	public boolean send(String message) {
		System.out.println("message is send via sms");
		return true;
	}
}

class EmailService  implements MessagingService{
	public boolean send(String message) {
		System.out.println("message is send via email");
		return true;
	}
}

//IOC inversion of control

class MessagingFactory{
	public static MessagingService getMessagingService() {
		return new SmsService();
	}
}
class BankService{
	
	private MessagingService service;
	
	BankService(MessagingService messagingService){
//		service=MessagingFactory.getMessagingService();
		this.service=messagingService;
	}
	
	public void transfer(int fromId, int toId, double amount) {
		service.send("99999");
		
		System.out.println("fund is transfred");
	}
	
}

public class DemoDIP {
	
	public static void main(String[] args) {
		
		BankService bankService=new BankService(new SmsService());
		bankService.transfer(1, 2, 10);
		
	}
	
	

}
