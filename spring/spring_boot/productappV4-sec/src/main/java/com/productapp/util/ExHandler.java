package com.productapp.util;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.productapp.dto.ErrorDetails;
import com.productapp.exception.ProductNotFoundException;

@RestControllerAdvice
public class ExHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorDetails> handle404(Exception ex) {
		ErrorDetails details = new ErrorDetails();
		details.setTimestemp(LocalDateTime.now());
		details.setDetails(ex.getMessage());
		details.setName("rgupta.mtech@gmail.com");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handle500(Exception ex){
		ErrorDetails details=new ErrorDetails();
		details.setTimestemp(LocalDateTime.now());
		details.setDetails("pls try after some time");
		details.setName("rgupta.mtech@gmail.com");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(details);
	}

	// MethodArgumentNotValidException

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {

		Map<String, String> errorMap = new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errorMap.put(error.getField(), error.getDefaultMessage());
		});
		return errorMap;
	}

}