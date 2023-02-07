package com.bankapp.entities;
import java.math.BigDecimal;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "account_table")
public class Account {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "acc_holder_name", nullable = false, length = 50)
    private String name;
    
	@Column(name = "acc_balance", nullable = false)
    private BigDecimal balance;
    
	@Column(name = "acc_holder_phone", nullable = false, length = 50)
    private String phone;
	
	@Column(name = "acc_holder_address", nullable = false, length = 100)
    private String address;

	public Account(String name, BigDecimal balance, String phone, String address) {
		super();
		this.name = name;
		this.balance = balance;
		this.phone = phone;
		this.address = address;
	}

	
	
}





