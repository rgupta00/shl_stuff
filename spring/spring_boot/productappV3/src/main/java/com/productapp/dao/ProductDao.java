package com.productapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	public Product findByName(String name);
}
