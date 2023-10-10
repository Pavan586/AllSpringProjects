package com.manytomany.hospital.service;
import java.util.List;

import com.manytomany.hospital.entity.Doctor;
import com.manytomany.hospital.entity.Hospital;

public interface HospitalService {
	void saveHospital(Hospital hospital);
	List<Hospital> getAllHospitals();
	public Hospital getHospitalById(int id);
	public List<Doctor> getAllDoctorsFromHospital(String hname);
	public void deleteHospital(int hid);

}
