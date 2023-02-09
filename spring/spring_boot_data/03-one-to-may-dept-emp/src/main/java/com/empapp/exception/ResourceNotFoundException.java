package com.empapp.exception;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -2054642051415045948L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
