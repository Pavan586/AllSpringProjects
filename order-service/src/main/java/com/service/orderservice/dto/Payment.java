package com.service.orderservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
	private int pid;
	private String pstatus;
	private int orderId;
	private int amount;
	
	

}
