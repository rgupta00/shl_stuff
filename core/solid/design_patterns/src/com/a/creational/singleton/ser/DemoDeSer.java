package com.a.creational.singleton.ser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class DemoDeSer {
	public static void main(String[] args) throws FileNotFoundException, IOException,
	ClassNotFoundException {
		//ser and de-ser process?
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("demo.ser"));
		Employee employee=(Employee) ois.readObject();
		
		System.out.println(employee);
	}

}
