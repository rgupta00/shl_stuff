package com.day3.session2.ex_handing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NeedOfExceptionHandling {

	public static void main(String[] args) {
		// why ex handling?

		// risky code

		Scanner scanner = null;
		try {
			System.out.println("PE x and y");
			scanner = new Scanner(System.in);

			int x, y;
			x = scanner.nextInt();
			y = scanner.nextInt();
			int z = x / y;
			System.out.println("value is z: " + z);

		} catch (ArithmeticException e) {
			System.out.println("deno should not be zero");

		} catch (InputMismatchException e) {
			System.out.println("pls enter int only");

		} finally {
			scanner.close();
		}

		System.out.println("done!");

	}

}
