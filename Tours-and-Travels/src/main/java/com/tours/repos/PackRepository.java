package com.tours.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tours.models.Pack;


@Repository
public interface PackRepository extends JpaRepository<Pack, Integer> {

}
