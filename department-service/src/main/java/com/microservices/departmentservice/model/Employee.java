package com.microservices.departmentservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eid;
	private Long did;
	private String ename;
	private int eage;
	public Employee(Long eid, Long did, String ename, int eage) {
		super();
		this.eid = eid;
		this.did = did;
		this.ename = ename;
		this.eage = eage;
	}
	public Employee() {
		super();
	}
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public Long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", did=" + did + ", ename=" + ename + ", eage=" + eage + "]";
	}
	
	
	

}
