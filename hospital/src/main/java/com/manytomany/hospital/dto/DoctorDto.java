package com.manytomany.hospital.dto;

import java.util.List;

import com.manytomany.hospital.entity.Doctor;

public class DoctorDto {
	private int id; 
	private String name;
	private int age;
	private double salary;
	private String category;
	private String gender;
	public DoctorDto(int id, String name, int age, double salary, String category, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.category = category;
		this.gender = gender;
	}
	public DoctorDto() {
		super();
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
