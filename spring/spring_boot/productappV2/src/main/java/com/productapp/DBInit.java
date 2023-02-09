package com.productapp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.productapp.entity.Product;
import com.productapp.service.ProductService;
@Component
public class DBInit implements CommandLineRunner{

	@Autowired
	private ProductService productService;
	@Override
	public void run(String... args) throws Exception {
		productService.addProduct(new Product("laptop", new BigDecimal(3000),"EL"));
		productService.addProduct(new Product("mouse", new BigDecimal(30),"EL"));
		productService.addProduct(new Product("Rich dad poor dad", new BigDecimal(30),"BOOK"));
		productService.addProduct(new Product("cool pad", new BigDecimal(300),"EL"));	
	}

}
