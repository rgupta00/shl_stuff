package com.demo3;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class BookService {
	
	//sort as per pricce and then as per title
	public static List<Book> getAllBooksSortedAsPerCondition(List<Book> books,Comparator<Book> comparator){
		return books.stream().sorted(comparator).collect(Collectors.toList());
		
	}
	


}
