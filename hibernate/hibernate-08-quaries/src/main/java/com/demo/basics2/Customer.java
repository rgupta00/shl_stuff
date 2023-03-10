package com.demo.basics2;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;

	private String address;

	private String mobile;

	public Customer(String name, String address, String mobile) {
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
}
