package com.manytomany.manytomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomany.manytomany.Entity.Item;

public interface ItemRepo extends JpaRepository<Item,Integer> {

}
