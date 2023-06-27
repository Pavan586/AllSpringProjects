package com.springboot.form.Form.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Form {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Form(Integer id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public Form() {
		
	}
	@Override
	public String toString() {
		return "Form [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	

}
