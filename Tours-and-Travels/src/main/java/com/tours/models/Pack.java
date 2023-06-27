package com.tours.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pack {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	String packagename;
	long cost;
	public String getPackagename() {
		return packagename;
	}
	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
	public Pack() {
	
	}
	public Pack(int pid, String packagename, long cost) {
		super();
		this.pid = pid;
		this.packagename = packagename;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Pack [pid=" + pid + ", packagename=" + packagename + ", cost=" + cost + "]";
	}
	 
	
	

}
