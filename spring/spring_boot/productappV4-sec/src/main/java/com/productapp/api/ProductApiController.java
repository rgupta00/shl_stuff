package com.productapp.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.entity.Product;
import com.productapp.service.ProductService;
@RequestMapping(path = "api")
@RestController
public class ProductApiController {

	private ProductService productService;

	@Autowired
	public ProductApiController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("products")
	public ResponseEntity<List<Product>> getAll(){
		return ResponseEntity.ok(productService.findAll());
	}
	
	@GetMapping("products/{id}")
	public ResponseEntity<Product> getAnProduct( @PathVariable("id") int id){
		return ResponseEntity.ok(productService.getById(id));
	}
	
	
	@DeleteMapping("products/{id}")
	public ResponseEntity<Void> deleteAnProduct( @PathVariable("id") int id){
		 productService.deleteProduct(id);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	
	@PutMapping("products/{id}")
	public ResponseEntity<Product> getProduct( @PathVariable("id") int id,@RequestBody   Product product){
		return ResponseEntity.status(HttpStatus.OK)
				.body(productService.updateProduct(id, product));
	}
	
	
	@PostMapping("products")
	public ResponseEntity<Product> addProduct( @RequestBody @Valid  Product product ){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(productService.addProduct(product));
	}
	
}












