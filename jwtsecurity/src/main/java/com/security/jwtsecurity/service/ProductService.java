package com.security.jwtsecurity.service;

import java.util.List;
import java.util.Map;

import com.security.jwtsecurity.entity.Product;
import com.security.jwtsecurity.exception.ProductNotFoundException;


public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> fetchAllProducts();
	public Product fetchProduct(Long id) throws ProductNotFoundException;
	
}