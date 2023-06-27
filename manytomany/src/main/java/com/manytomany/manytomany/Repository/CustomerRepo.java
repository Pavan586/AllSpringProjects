package com.manytomany.manytomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.manytomany.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
