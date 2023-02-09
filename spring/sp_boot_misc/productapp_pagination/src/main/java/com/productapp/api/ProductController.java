package com.productapp.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.entities.Product;
import com.productapp.service.ProductService;

@RestController
public class ProductController {
	
	
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	//
//	@GetMapping(path = "products")
//	public List<Product> getAll(){
//		return productService.findAll();
//	}
//
//	@GetMapping(path = "products2")
//	public List<Product> getAllProductWithSoring(@RequestParam(name = "field") String field){
//		return productService.findAllWithSorting(field);
//	}
//
//	@GetMapping(path = "products3")
//	public Page<Product> findAllWithPagination(@RequestParam(name = "offset", required = false, defaultValue = "1") int offset,
//			@RequestParam(name = "pageSize", required = false, defaultValue = "1") int pageSize){
//		return productService.findAllWithPagination(offset, pageSize);
//	}
	
	@GetMapping(path = "products")
	public Page<Product> findAllWithPaginationAndSoring(
			@RequestParam(name = "offset", required = false, defaultValue = "1") int offset,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize,
			@RequestParam(name = "field", required = false,  defaultValue = "name") String field){
		return productService.findAllWithPaginationAndSorting(offset, pageSize, field);
	}
}



