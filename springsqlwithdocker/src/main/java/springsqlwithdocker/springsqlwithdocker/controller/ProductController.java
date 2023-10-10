package springsqlwithdocker.springsqlwithdocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springsqlwithdocker.springsqlwithdocker.entity.Product;
import springsqlwithdocker.springsqlwithdocker.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	@PostMapping("/add")
	public void saveProducr(@RequestBody Product product) {
		ps.save(product);
		
	}
	@GetMapping("/get")
	public List<Product> getProducts() {
		return ps.getProducts();
		
	}

}
