package com.demo3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		//public Book(String isbn, String title, String author, double price)
		List<Book> books=Arrays.asList(
				new Book("1212", "java effective", "foo", 400),
				new Book("129", "power of subconsious mind", "foo", 600)
				);
		
//	
//		books.forEach(b-> System.out.println(b));
		
		
		Comparator<Book> compararedAsPerPrice= ( o1,  o2)-> 
				 Double.compare(o2.getPrice(), o1.getPrice());
			
		
		
		
		
		
		List<Book> books2=BookService.getAllBooksSortedAsPerCondition(books,compararedAsPerPrice);
		books.forEach(b-> System.out.println(b));
		
	}
}
