package com.manytomany.manytomany.Entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Item {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="items")
	private Set<Customer> customer=new HashSet<>();
	
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Item() {
		super();
	}
	

}
