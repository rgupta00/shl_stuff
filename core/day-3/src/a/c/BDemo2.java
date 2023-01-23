package a.c;
import a.b.*;

//private	default 		protected	public
public class BDemo2 extends A{
	
	public static void main(String[] args) {
		//if a class is public then its public data/method can be access in any way
		
		
		//private XXX
		
		//if a class is public then its "default" data/method can NOT be access in any way
		
		
		//if a class is public then its "protected" data/method can only be access iff
		//the class of sec package must sub class it
		
	BDemo2 d= new BDemo2();
	System.out.println(d.k);
	d.foo3();
	d.foo4();
		
	}

}
