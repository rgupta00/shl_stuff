package com.f.java8streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

//Date
public class E_Java8date {
	
	public static void main(String[] args) {
		
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
		
//		LocalDate date=LocalDate.of(2011, Month.APRIL, 13);
//		System.out.println(date);
		
		System.out.println("pls enter date in dd/MM/yyyy formate");
		Scanner scanner=new Scanner(System.in);
		String dateString =scanner.nextLine();
		System.out.println(dateString);
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date=LocalDate.parse(dateString,dateTimeFormatter );
		
		System.out.println(date);
		
		
		
//		Date date=new Date(19, 11, 11);//mutable :(
//		System.out.println(date);
	}

}








