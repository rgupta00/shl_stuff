package com.bankapp.basics3;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {

	
	private  Integer id;

	private String name;

	private String mobile;

	
	private List<String> emails=new ArrayList<>();


	public Customer(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}
	public void addEmail(String email){
		emails.add(email);
	}
}
