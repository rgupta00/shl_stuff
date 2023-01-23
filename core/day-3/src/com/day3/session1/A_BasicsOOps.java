package com.day3.session1;
//interface vs abs calss
//interface : can interface have instance varaibale X
	//public static final const
	//can we define a method inside interface (Upto java 7) since java 8 yes*


//class M{
//	int i=0;
//	public  void foo() {
//		System.out.println("foo of M");
//	}
//}
//
//class N extends M{
//	int i=77;
//	public  void foo() {
//		System.out.println("foo of N"+ super.i);
//	}
//}

//call by value and call by ref

//public class A_BasicsOOps {
//	
//	public static void main(String[] args) {
//			int i=9;
//			int j=6;
//			System.out.println("value of i" + i+" value of j:"+ j);
//			swap(i, j);
//			System.out.println("value of i" + i+" value of j:"+ j);
//			
//	}
//
//	 static void swap(int i, int j) {
//		 	int temp=i;
//		 	i=j;
//		 	j=temp;
//	}
//
//}


//
class Val{
	int data;

	public Val(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
public class A_BasicsOOps {
	
	public static void main(String[] args) {
			Val i=new Val(9);
			

//			System.out.println("value of i" + i.getData()+" value of j:"+ j.getData());
//			swap(i, j);
//			System.out.println("value of i" + i.getData()+" value of j:"+ j.getData());
			
			System.out.println("value of i: "+ i.getData());
			changeMe(i);
			System.out.println("value of i: "+ i.getData());
	}

	 static void changeMe( Val i) {
		 //i is final ie i cant change but the state of object can be change
		 //i.setData(i.getData()+100);
		 i=null;
	}
	 
//	static void swap(Val i, Val j) {
//	 	Val temp=i;
//	 	i=j;
//	 	j=temp;
//	}
}

































