package com.bookapp.excpetions;

public class DataAccessException extends RuntimeException {

	public DataAccessException(Exception exception) {
		super(exception);
	}

}
