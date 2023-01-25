package com.day4.session2;
//to provide better BL
//Glass
interface Flowable{
	
}
interface Drinkable{
	
}

class Water implements Flowable, Drinkable{
}
class Juice implements Flowable,Drinkable{
	
}
class Cake{
	
}
class Petrol implements Flowable{
	
}
class Glass<T extends Flowable & Drinkable>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class MoreUseCaseOfExtends {
	
	public static void main(String[] args) {
		Glass<Water> glass=new Glass<>();
		
		
		
	}

}




