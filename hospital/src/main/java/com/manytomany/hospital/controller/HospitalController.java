package com.manytomany.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.hospital.entity.Doctor;
import com.manytomany.hospital.entity.Hospital;
import com.manytomany.hospital.serviceimpl.HospitalServiceImpl;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	@Autowired
	HospitalServiceImpl hs;
	@PostMapping("/add")
	public void saveHospital(@RequestBody Hospital hospital) {
		hs.saveHospital(hospital);
		
	}
	@GetMapping("/getall")
	public List<Hospital> getAllHospitals() {
		return hs.getAllHospitals();
	}
	@GetMapping("getbyid/{id}")
	public Hospital getHospital(@PathVariable int id) {
		return hs.getHospitalById(id);
	}
	@GetMapping("/getalldoctors/{hname}")
	public List<Doctor> getAllDoctorsFromhospital(@PathVariable String hname) {
		return hs.getAllDoctorsFromHospital(hname);
	}
	@DeleteMapping("/delete/{hid}")
	public void deleteHospital(@PathVariable int hid) {
		hs.deleteHospital(hid);
		
	}

}
