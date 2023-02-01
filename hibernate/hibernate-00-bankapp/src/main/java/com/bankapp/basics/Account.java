package com.bankapp.basics;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@Table(name="acc_table")
public class Account {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;


	private String name;

	private BigDecimal balance;

	@Enumerated(EnumType.STRING)
	private CustomerType customerType;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Transient
	private int tempCalcalation;

	public Account(String name, BigDecimal balance, CustomerType customerType, Date date) {
		this.name = name;
		this.balance = balance;
		this.customerType = customerType;
		this.date = date;
	}
}
