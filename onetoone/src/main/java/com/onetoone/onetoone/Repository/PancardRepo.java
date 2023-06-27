package com.onetoone.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.onetoone.Entity.Pancard;
@Repository
public interface PancardRepo extends JpaRepository<Pancard, Integer>{

}
