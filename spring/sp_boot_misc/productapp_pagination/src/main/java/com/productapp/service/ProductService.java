package com.productapp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.productapp.entities.Product;

public interface ProductService {
	public List<Product> findAll();
	public List<Product> findAllWithSorting(String field);
	
	public Page<Product> findAllWithPagination(int offset, int pageSize);
	
	public Page<Product> findAllWithPaginationAndSorting(int offset, int pageSize, String field);
	
	public Product getById(int id);
	public Product addProduct(Product product);
	public Product updateProduct(int id, Product product);
	public Product deleteProduct(int id);
	
}