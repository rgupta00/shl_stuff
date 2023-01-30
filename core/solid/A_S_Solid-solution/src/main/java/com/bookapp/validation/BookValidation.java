package com.bookapp.validation;

public class BookValidation {

	public boolean isValidIsbn(String isbn) {
		return isbn.length()==5;
	}
}
