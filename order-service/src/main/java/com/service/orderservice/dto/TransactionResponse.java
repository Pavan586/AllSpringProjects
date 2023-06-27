package com.service.orderservice.dto;

import com.service.orderservice.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionResponse {
	private Order order;
	private int amount;
	private String message;
	

}
