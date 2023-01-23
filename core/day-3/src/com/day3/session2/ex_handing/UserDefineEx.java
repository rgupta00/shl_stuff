package com.day3.session2.ex_handing;

//some userdefine ex

class AccountCreationException extends RuntimeException{
	public AccountCreationException(String message) {
		super(message);
	}
}
class NotSufficientFundException extends RuntimeException{
	public NotSufficientFundException(String message) {
		super(message);
	}
}

class OverFundException extends RuntimeException{
	public OverFundException(String message) {
		super(message);
	}
}

class Account {
	private int accountId;
	private double accountBalance;

	//1K
	public Account(int accountId, double accountBalance)throws AccountCreationException{
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		if(accountBalance<1000)
			throw new AccountCreationException("account can not open with "+ accountBalance);
	}

	//1K
	public void withdraw(double amount) {
		double temp=accountBalance-amount;
		if(temp<1000) {
			throw new NotSufficientFundException("your balance at time must be 1K");
		}
		accountBalance=temp;
	}
	//20L
	public void deposit(double amount) {
		double temp=accountBalance+amount;
		if(temp>=200_00_00) {
			throw new OverFundException("your balance at time must be 1K");
		}
		accountBalance=temp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [accountId=").append(accountId).append(", accountBalance=").append(accountBalance)
				.append("]");
		return builder.toString();
	}

}

public class UserDefineEx {
	public static void main(String[] args) {

		try{
			Account account=new Account(121, 8000);
			
			System.out.println(account);
		}catch(AccountCreationException e) {
			System.out.println(e.getMessage());
		}
		
	}

}












