package com.security.jwtsecurity.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.security.jwtsecurity.entity.Product;
import com.security.jwtsecurity.exception.ProductNotFoundException;
import com.security.jwtsecurity.repository.ProductRepository;


@Service
@Primary
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	boolean flag;
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> fetchAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product fetchProduct(Long id) throws ProductNotFoundException {
		Product product = null;
		if(id != null && id != 0) {
			flag = productRepository.existsById(id);
		}
		if(flag) 
			product = productRepository.findById(id).get();
		else
			throw new ProductNotFoundException("Product Not Found");
		return product;
	}

	
}
