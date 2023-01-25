package com.b.classical_threads2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Printer {

	// private Object lock=new Object();

	private Lock lock = new ReentrantLock(true);

	public void print(String letter) {

		//

		try {
			lock.lock();
			System.out.print("[");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}

			System.out.println(letter + "]");
		} finally {
			lock.unlock();
		}

		//
		//
	}
}

class Client implements Runnable {
	private Thread thread;
	private Printer printer;
	private String letter;

	public Client(Printer printer, String letter) {
		this.printer = printer;
		this.letter = letter;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		printer.print(letter);
	}
}

public class B_NeedOfSyn {

	public static void main(String[] args) {

		Printer printer = new Printer();
		Client client1 = new Client(printer, "i love java");
		Client client2 = new Client(printer, "i hate java");
		Client client3 = new Client(printer, "i love india");

	}

}
