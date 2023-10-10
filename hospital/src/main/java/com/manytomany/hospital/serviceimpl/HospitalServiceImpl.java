package com.manytomany.hospital.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manytomany.hospital.entity.Doctor;
import com.manytomany.hospital.entity.Hospital;
import com.manytomany.hospital.repository.HospitalRepository;
import com.manytomany.hospital.service.HospitalService;
@Component
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	HospitalRepository hr;
	@Autowired
	DoctorServiceImpl ds;

	@Override
	public void saveHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		hr.save(hospital);
		
	}

	@Override
	public List<Hospital> getAllHospitals() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public Hospital getHospitalById(int id) {
		// TODO Auto-generated method stub
		return hr.findById(id).get();
	}

	@Override
	public List<Doctor> getAllDoctorsFromHospital(String hname) {
		// TODO Auto-generated method stub
		List<Doctor> doc=null;
		int id=hr.findIdByHospitalName(hname);
		Hospital h=hr.findById(id).get();
		doc=h.getDoctors();
		return doc;
		
	}

	@Override
	public void deleteHospital(int hid) {
		// TODO Auto-generated method stub
		Hospital h=hr.getById(hid);
		
		hr.deleteById(hid);
		
	}

}
