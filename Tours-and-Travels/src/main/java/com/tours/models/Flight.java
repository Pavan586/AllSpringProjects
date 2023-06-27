package com.tours.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vehicle;
	private int trav;
	private int children;
	private int adults;
	private String place;
	private String bdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setvehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public int getTrav() {
		return trav;
	}
	public void settrav(int trav) {
		this.trav = trav;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public String getplace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ",vehicle=" + vehicle+ ", trav=" + trav + ", children=" + children + ", adults=" + adults + ", place="
				+ place + ", bdate=" + bdate + "]";
	}
	
	
	
}
