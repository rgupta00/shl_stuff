package com.productappclient.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Product {
	private Integer id;
	private String name;
	private BigDecimal price;
	
	private String category;

	public Product(
			String name,BigDecimal price,String category) {
		
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	
	
}
