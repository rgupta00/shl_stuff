package com.productappclient.api;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.productappclient.dto.Product;
import com.productappclient.service.ProductServiceProxy;

@RestController
public class ProductApiClient {
	
	//it want to get all the product from another application : restTemplate, webclient, open feign
	
	@Autowired
	private ProductServiceProxy productServiceProxy;
	
	
	
//	@Autowired
//	private RestTemplate restTemplate;
//	
	@GetMapping(path = "getproduct/{id}")
	public ResponseEntity<Product> getAllProducts(@PathVariable("id") int id){
		
		return productServiceProxy.findById(id);
	}

}
