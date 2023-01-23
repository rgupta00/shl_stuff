package com.day2.session1.is_a;


class PaymentProcessing{
	public void processPayment(Payable payable) {
		//do some db programming
		payable.getPay();
	}
}

interface Payable{
	public abstract double getPay();
}
abstract class Employee implements Payable{
	private int employeeId;
	private String employeeName;
	
	
	public Employee(int employeeId, String employeeName) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	
	public void print() {
		System.out.println("id : "+ employeeId+" emp name "+ employeeName);
	}
	
}

class Consultant implements Payable {
	private String consultantName;
	private double pricePerDay;
	private int numberOfDays;
	
	
	
	public Consultant(String consultantName, double pricePerDay, int numberOfDays) {
		this.consultantName = consultantName;
		this.pricePerDay = pricePerDay;
		this.numberOfDays = numberOfDays;
	}

	@Override
	public double getPay() {
		return pricePerDay*numberOfDays;
	}
	
	public void print() {
		System.out.println("----------------");
	}
}



class PartTimeEmployee extends Employee{

	private int numberOfDays;
	private double payPerDay;
	
	public PartTimeEmployee(int employeeId, String employeeName,int numberOfDays,
	 double payPerDay) {
		super(employeeId, employeeName);
		this.numberOfDays=numberOfDays;
		this.payPerDay=payPerDay;
	}


	
	
	@Override
	public double getPay() {
		return numberOfDays*payPerDay*0.75;
	}

	public void print() {
		super.print();
		System.out.println("numberOfDays: "+ numberOfDays+ " payPerDay "+ payPerDay);
	}
	
	
}

class FullTimeEmployee extends Employee{
		private String ppf;
		private double shareValue;
		private double salary;// hra...
	public FullTimeEmployee(int employeeId, String employeeName,
			String ppf, double shareValue, double salary) {
		super(employeeId, employeeName);
		this.ppf = ppf;
		this.shareValue = shareValue;
		this.salary = salary;
	}
	@Override
	public double getPay() {
		return salary*0.8;
	}
	
	public void print() {
		super.print();
		System.out.println("ppf: "+ ppf+ " sharevalue "+ shareValue+" net salary "+getPay());
	}
	
	
}

public class DemoWhenToGoForAbstrClassVsInterface {
	
	public static void main(String[] args) {
		
		Employee employee=new FullTimeEmployee(2, "raja", "7767565566", 78,90);
		employee.print();
		
		Employee employee2=new PartTimeEmployee(2, "raja", 12,30);
		
		employee2.print();
		
	}

}









