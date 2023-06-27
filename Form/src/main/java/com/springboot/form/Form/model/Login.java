package com.springboot.form.Form.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uname;
	private String password;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Login(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public Login() {
		
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", uname=" + uname + ", password=" + password + "]";
	}
	

}
