package com.manytomany.hospital.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.hospital.dto.DoctorHospitalDto;
import com.manytomany.hospital.entity.Doctor;
import com.manytomany.hospital.entity.Hospital;
import com.manytomany.hospital.serviceimpl.DoctorServiceImpl;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	DoctorServiceImpl ds;
	@PostMapping("/add")
	public void saveDoctor(@RequestBody Doctor doctor) {
		ds.saveDoctor(doctor);
		
	}
	@GetMapping("/getall")
	public List<Doctor> getAllDoctors() {
		return ds.getAllDoctors();
	}
	@GetMapping("getbyid/{id}")
	public Doctor getDoctor(@PathVariable int id) {
		return ds.getDoctorById(id);
	}
	@PutMapping("/assign/{did}/{hid}")
	public Doctor assignHospitalToDoctor(@PathVariable int did,@PathVariable int hid) {
		return ds.assignHospitalToDoctor(did, hid);
	}
	@GetMapping("/getallhospitals/{dname}")
	public List<Hospital> fetchHospitals(@PathVariable String dname) {
		return ds.fetchHospitals(dname);
	}
	@GetMapping("/getdoctorhospital/{did}")
	public List<DoctorHospitalDto> getDoctorHospitals(@PathVariable int did) {
		return ds.getDoctorHospitals(did);
		
	}
	@GetMapping("/getalldoctorhospital")
	public List<DoctorHospitalDto> getDoctorHospitals() {
		return ds.getAllDoctorHospitals();
		
	}
	@PutMapping("/delete/{did}/{hid}")
	public void deleteDoctor(@PathVariable int did,@PathVariable int hid) {
		ds.deleteDoctor(did,hid);
		
	}
	@GetMapping("/getdata/{did}/{hid}")
	public List<Doctor> getData(@PathVariable int did,@PathVariable int hid) {
		return ds.getData(did,hid);
		
	}
	
	

}
