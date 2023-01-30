package com.a.creational.singleton.ser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class DemoSer {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//ser and de-ser process?
		
		Employee employee=new Employee(1, "rajiv", new Date());
		
		ObjectOutputStream ois=new ObjectOutputStream(new FileOutputStream("demo.ser"));
		ois.writeObject(employee);
		System.out.println("----------------");
		System.out.println(employee);
	}

}
