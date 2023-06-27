package com.springboot.form.Form.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
	private int age;
	private String rname;
	private String rpassword;
	private String rpassword1;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	public String getRpassword1() {
		return rpassword1;
	}
	public void setRpassword1(String rpassword1) {
		this.rpassword1 = rpassword1;
	}
	public Register(int age, String rname, String rpassword, String rpassword1) {
		super();
		this.age = age;
		this.rname = rname;
		this.rpassword = rpassword;
		this.rpassword1 = rpassword1;
	}
	public Register() {
		
	}
	

}
