package com.security.springsecurity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.security.springsecurity.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
