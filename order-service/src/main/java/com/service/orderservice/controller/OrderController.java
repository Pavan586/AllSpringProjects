package com.service.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.orderservice.dto.TransactionRequest;
import com.service.orderservice.dto.TransactionResponse;
import com.service.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService os;
	//@PostMapping("/bookorder")
	/*public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
		return os.saveOrder(request);
		
	}*/
	
	

}
