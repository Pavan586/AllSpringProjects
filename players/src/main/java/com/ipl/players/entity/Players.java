package com.ipl.players.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Players {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int pid;
	private int tid;
	private String pname;
	private String pemail;
	private String pcategory;
	private String pcountry;
	private int page;
	private int pbudget;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPbudget() {
		return pbudget;
	}
	public void setPbudget(int pbudget) {
		this.pbudget = pbudget;
	}
	
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public Players(int pid, int tid, String pname, String pemail, String pcategory, String pcountry, int page,
			int pbudget) {
		super();
		this.pid = pid;
		this.tid = tid;
		this.pname = pname;
		this.pemail = pemail;
		this.pcategory = pcategory;
		this.pcountry = pcountry;
		this.page = page;
		this.pbudget = pbudget;
	}
	public Players() {
		super();
	}
	@Override
	public String toString() {
		return "Players [pid=" + pid + ", tid=" + tid + ", pname=" + pname + ", pemail=" + pemail + ", pcategory="
				+ pcategory + ", pcountry=" + pcountry + ", page=" + page + ", pbudget=" + pbudget + "]";
	}
	
	
	
	
}
	
	