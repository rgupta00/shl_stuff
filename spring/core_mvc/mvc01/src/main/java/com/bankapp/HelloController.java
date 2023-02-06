package com.bankapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("init is called");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("do get is called");
		PrintWriter out=response.getWriter();
		LocalDateTime dateTime=LocalDateTime.now();
		out.print("hello all :"+ dateTime);

	}
	

	@Override
	public void destroy() {
		System.out.println("destory is called");
		super.destroy();
	}


}
