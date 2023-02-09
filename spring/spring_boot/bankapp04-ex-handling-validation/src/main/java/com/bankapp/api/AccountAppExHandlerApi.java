package com.bankapp.api;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bankapp.dto.ErrorInfo;
import com.bankapp.exceptions.BankAccountNotFoundException;

@RestControllerAdvice		//used to handle ex in my web layer it use throws advice under the hood
public class AccountAppExHandlerApi {

	@ExceptionHandler(BankAccountNotFoundException.class)
	public ResponseEntity<ErrorInfo> handle404(BankAccountNotFoundException ex){
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setDateTime(LocalDateTime.now());
		errorInfo.setMessage(ex.getMessage());
		errorInfo.setErrorcode(HttpStatus.NOT_FOUND.toString());
		errorInfo.setTocontact("shl@team.com");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInfo> handle400(MethodArgumentNotValidException ex){
		
		String errorMessage= ex.getBindingResult().getAllErrors().stream()
				.map(e->e.getDefaultMessage())
				.collect(Collectors.joining(","));
		
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setDateTime(LocalDateTime.now());
		errorInfo.setMessage(errorMessage);
		errorInfo.setErrorcode(HttpStatus.BAD_REQUEST.toString());
		errorInfo.setTocontact("shl@team.com");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorInfo);
		
	}
	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorInfo> handle500(Exception ex){
//		ErrorInfo errorInfo=new ErrorInfo();
//		errorInfo.setDateTime(LocalDateTime.now());
//		errorInfo.setMessage("please try after some time");
//		errorInfo.setErrorcode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
//		errorInfo.setTocontact("shl@team.com");
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorInfo);
//		
//	}
	
}
