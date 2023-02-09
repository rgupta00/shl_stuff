package com.productappclient.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.productappclient.dto.Product;

@FeignClient(name="product-service",
			url="http://localhost:8090/productapp/api")  
public interface ProductServiceProxy {
	@GetMapping(path = "products")
	public ResponseEntity<List<Product>> findAll();
	
	@GetMapping(path = "products/{id}")
	public ResponseEntity<Product> findById(@PathVariable(name = "id") int id);
	
	@PostMapping(path = "products")
	public ResponseEntity<Product> addProduct( @RequestBody Product product);
	
	@DeleteMapping(path = "products/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable(name = "id") int id);
	
	@PutMapping(path = "products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable(name = "id") int id, 
			@RequestBody Product product);
}