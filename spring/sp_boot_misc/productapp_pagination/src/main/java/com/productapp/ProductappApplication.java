package com.productapp;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.entities.Product;
import com.productapp.repo.ProductDao;

@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductDao productDao;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> list=IntStream.rangeClosed(1, 200)
				.mapToObj(i-> new Product("product "+ i , new Random().nextInt(100),  new Random().nextInt(10000) ))
				.collect(Collectors.toList());
		
		productDao.saveAll(list);
	}

}















