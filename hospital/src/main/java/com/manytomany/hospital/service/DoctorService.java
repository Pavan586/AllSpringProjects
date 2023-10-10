package com.manytomany.hospital.service;

import java.util.List;
import com.manytomany.hospital.dto.DoctorHospitalDto;
import com.manytomany.hospital.entity.Doctor;
import com.manytomany.hospital.entity.Hospital;

public interface DoctorService {
	public void saveDoctor(Doctor doctor);
	public List<Doctor> getAllDoctors();
	public Doctor getDoctorById(int id);
	Doctor assignHospitalToDoctor(int did,int hid);
	List<Hospital> fetchHospitals(String dname);
	List<DoctorHospitalDto> getDoctorHospitals(int id);
	List<DoctorHospitalDto> getAllDoctorHospitals();
	public void deleteDoctor(int did,int hid);
	public List<Doctor> getData(int did,int hid);


}
