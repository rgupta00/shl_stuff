package aex.demo;
//Seprate what varies...
//Fat interface : SOL I D(DIP)
//interface BirdBehaviour {
//	public void swim() ;
//	public void fly() ;
//}


interface Flyable {
	public void fly() ;
}
interface Swimable{
	public void swim() ;
}


abstract class Bird{
	public void eat() {
		System.out.println("eating....");
	}
	
}
class Eagle extends Bird implements Flyable{
	public void fly() {
		System.out.println("beat me in this if u can in flying...");
	}
	
}

class Duck extends Bird implements Swimable{
	public void swim() {
		System.out.println("beat me in this if u can in swiming....");
	}
	
}

class Emu extends Bird{
}




public class DemoISP {

	public static void main(String[] args) {
		
		Eagle eagle=new Eagle();
		eagle.eat();
		eagle.fly();
	
		
		
		
		/*SOLID
		 * ISP
		 * 
		 * Interface Pollution problem
		 * => classes have empty method implementation
		 * => method throws UnSupporedExceptions
		 * => Method implementation return null or return dummy values
		 * 
		 */
	}
}
