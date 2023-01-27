package com.demo3;
import java.util.*;
import java.util.function.Predicate;
public class BookService {
	
	public static List<Book> getAllBooks(List<Book> books){
		return null;
	}
								//Behavioural parameterization is a kind light wt strategy dp
	public static List<Book> getAllBooksOnCondition(List<Book> books, Predicate<Book> predicate){
		//book> 500
		List<Book> costlyBooks=new ArrayList<Book>();
		for(Book book: books) {
			if(predicate.test(book)) {
				costlyBooks.add(book);
			}
		}
		return costlyBooks;
	}
	
}
