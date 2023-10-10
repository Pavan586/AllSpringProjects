package com.security.jwtsecurity.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.security.jwtsecurity.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}