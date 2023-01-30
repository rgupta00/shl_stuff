package com.a.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

class MySingleton implements Cloneable, Serializable {

	// lazy and eager loading

	private static MySingleton mySingleton;

	// t1 t2
	public static MySingleton getMySingleton() {
		if (mySingleton == null) {
			synchronized (MySingleton.class) {
				mySingleton = new MySingleton();
			}
		}
		return mySingleton;
	}

	private MySingleton() {
		if (mySingleton != null)
			throw new IllegalStateException();

		System.out.println("it is a ctr");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}

	private Object readResolve() {
		return mySingleton;
	}
//	

}

public class DemoSingleton {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, CloneNotSupportedException, FileNotFoundException, IOException {

		MySingleton mySingleton = MySingleton.getMySingleton();
		System.out.println(mySingleton.hashCode());

		// 3. it can be broken by ser...
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo.ser"));
		oos.writeObject(mySingleton);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo.ser"));

		MySingleton mySingleton2 = (MySingleton) ois.readObject();
		System.out.println(mySingleton2.hashCode());

		// 2. clonning: u can make a duplate copy of the object copy ctr vs clonning

//		MySingleton mySingleton2=(MySingleton) mySingleton.clone();
//		
//		System.out.println(mySingleton2.hashCode());

		// 1. reflection : can we can even a private ctr using ref : Y
//		Class<?> class1=Class.forName("com.a.creational.singleton.MySingleton");
//		
//		Constructor<?>constructor[]=class1.getDeclaredConstructors();
//		
//		constructor[0].setAccessible(true);
//		
//		MySingleton mySingleton2=(MySingleton) constructor[0].newInstance();
//		System.out.println(mySingleton2.hashCode());

	}
}
