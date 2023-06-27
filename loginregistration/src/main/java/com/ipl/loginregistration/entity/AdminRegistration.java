package com.ipl.loginregistration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class AdminRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String aemail;
	private String apassword;
	public AdminRegistration(int aid, String aemail, String apassword) {
		super();
		this.aid = aid;
		this.aemail = aemail;
		this.apassword = apassword;
	}
	public AdminRegistration() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	@Override
	public String toString() {
		return "AdminRegistration [aid=" + aid + ", aemail=" + aemail + ", apassword=" + apassword + "]";
	}
	
	
	

}
