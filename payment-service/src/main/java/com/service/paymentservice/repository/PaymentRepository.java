package com.service.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.paymentservice.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
