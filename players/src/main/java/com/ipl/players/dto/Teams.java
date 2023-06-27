package com.ipl.players.dto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Teams {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String tname;
	private int tbudget;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTbudget() {
		return tbudget;
	}
	public void setTbudget(int tbudget) {
		this.tbudget = tbudget;
	}
	
	public Teams(int tid, String tname, int tbudget) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tbudget = tbudget;
	}
	public Teams() {
		super();
	}
	@Override
	public String toString() {
		return "Teams [tid=" + tid + ", tname=" + tname + ", tbudget=" + tbudget + "]";
	}
	
}