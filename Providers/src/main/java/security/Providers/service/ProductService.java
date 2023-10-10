package security.Providers.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import security.Providers.entity.Product;
import security.Providers.repository.ProductRepository;

@Component
public class ProductService {
	@Autowired
	ProductRepository pr;

	public void save(Product product) {
		// TODO Auto-generated method stub
		pr.save(product);
		
		
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}
