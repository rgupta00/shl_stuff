package com.productapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.productapp.service.ProductService;
//
//@Controller
//public class ProductController {
//	
//	private ProductService productService;
//
//	@Autowired
//	public ProductController(ProductService productService) {
//		this.productService = productService;
//	}
//	
//	@GetMapping("products")
//	public ModelAndView allProducts(ModelAndView mv) {
//		mv.setViewName("productlist");
//		mv.addObject("products", productService.findAll());
//		
//		return mv;
//	}
//}