package com.customerapp.exceptions;

//Serilizatation :)

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
