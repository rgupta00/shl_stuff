package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder

@Entity
@Table(name = "cust_table")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id", nullable = false)
	private Integer id;
	
	@Column(name = "cust_name", nullable = false, length = 40)
	private String name;
	
	@Column(name = "cust_address", nullable = false, length = 100)
	private String address;
	
	@Column(name = "cust_phone", nullable = false, length = 15)
	private String phone;
	
	@Column(name = "cust_email", nullable = false, length = 15)
	private String email;
	
	
	public Customer(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email=email;
	}
	

}




