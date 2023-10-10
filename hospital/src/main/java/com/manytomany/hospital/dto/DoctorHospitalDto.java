package com.manytomany.hospital.dto;

import java.util.List;

import com.manytomany.hospital.entity.Doctor;
import com.manytomany.hospital.entity.Hospital;

public class DoctorHospitalDto {
	private List<Doctor> ddto;
	private List<Hospital> hdto;
	
	
	public DoctorHospitalDto(List<Doctor> ddto, List<Hospital> hdto) {
		super();
		this.ddto = ddto;
		this.hdto = hdto;
	}
	public DoctorHospitalDto() {
		super();
	}
	public List<Doctor> getDdto() {
		return ddto;
	}
	public void setDdto(List<Doctor> ddto) {
		this.ddto = ddto;
	}
	public List<Hospital> getHdto() {
		return hdto;
	}
	public void setHdto(List<Hospital> hdto) {
		this.hdto = hdto;
	}
	
	
}
