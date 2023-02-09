package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductDao;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> findAll() {
		return productDao.findAll();
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAllWithSorting(String field) {
		return productDao.findAll(Sort.by(Sort.Direction.ASC, field));
	}

	@Override
	public Page<Product> findAllWithPagination(int offset, int pageSize) {
		return productDao.findAll(PageRequest.of(offset, pageSize));
	}

	@Override
	public Page<Product> findAllWithPaginationAndSorting(int offset, int pageSize, String field) {
		return productDao.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
	}



}




