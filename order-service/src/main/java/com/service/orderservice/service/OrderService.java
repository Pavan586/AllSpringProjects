package com.service.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.orderservice.dto.Payment;
import com.service.orderservice.dto.TransactionRequest;
import com.service.orderservice.dto.TransactionResponse;
import com.service.orderservice.entity.Order;
import com.service.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository or;

	/*public TransactionResponse saveOrder(TransactionRequest request) {
		// TODO Auto-generated method stub
		Order order=request.getOrder();
		Payment payment=request.getPayment();
		payment.set
		
		return null;
	}*/

}
