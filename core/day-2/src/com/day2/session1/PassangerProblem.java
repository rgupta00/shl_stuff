package com.day2.session1;

//abs

abstract class Vehicle{
	public  abstract void move(String source, String destination);
}


class Bike extends Vehicle{
	public void move(String source, String destination) {
		System.out.println("moving from "+ source+ " to "+ destination+" using bike");
	}
}


class Metro extends Vehicle{
	public void move(String source, String destination) {
		System.out.println("moving from "+ source+ " to "+ destination+" using metro");
	}
}

class Car extends Vehicle{
	public void move(String source, String destination) {
		System.out.println("moving from "+ source+ " to "+ destination+" using car");
	}
}



class Passanger{
	private String passagerName;
	
	public Passanger(String passagerName) {
		this.passagerName=passagerName;
	}
	//use a
	public void travel(String source, String destination, Vehicle vehicle) {
		System.out.println("passanger name is :"+ passagerName);
		vehicle.move(source, destination);	
	}
	
}

public class PassangerProblem {
	
	public static void main(String[] args) {
		
//		Metro metro=new Metro();
		Vehicle vehicle=new Metro();
		
		Passanger passanger1=new Passanger("ravi");
		passanger1.travel("LN", "Noida", vehicle);
		
	}

}
