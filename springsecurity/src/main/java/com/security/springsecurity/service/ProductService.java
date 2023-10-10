package com.security.springsecurity.service;

import java.util.List;
import java.util.Map;

import com.security.springsecurity.entity.Product;
import com.security.springsecurity.exception.ProductNotFoundException;

public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> fetchAllProducts();
	public Product fetchProduct(Long id) throws ProductNotFoundException;
	public Product putUpdateProduct(Long id, Product product) throws ProductNotFoundException;
	public Product patchUpdateProduct(Long id, Map<String, Object> productMap)throws ProductNotFoundException;
	public String deleteProduct(Long id);

}
