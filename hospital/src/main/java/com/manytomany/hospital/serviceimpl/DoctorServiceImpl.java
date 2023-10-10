package com.manytomany.hospital.serviceimpl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manytomany.hospital.dto.DoctorDto;
import com.manytomany.hospital.dto.DoctorHospitalDto;
import com.manytomany.hospital.entity.Doctor;
import com.manytomany.hospital.entity.Hospital;
import com.manytomany.hospital.repository.DoctorRepository;
import com.manytomany.hospital.repository.HospitalRepository;
import com.manytomany.hospital.service.DoctorService;
@Component
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorRepository dr;
	@Autowired
	HospitalRepository hr;

	@Override
	public void saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		dr.save(doctor);
		
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	@Override
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		return dr.findById(id).get();
	}

	@Override
	public Doctor assignHospitalToDoctor(int did, int hid) {
		// TODO Auto-generated method stub
		List<Hospital> hos=null;
		Doctor doctor=dr.findById(did).get();
		Hospital hospital=hr.findById(hid).get();
		hos=doctor.getHospitals();
		hos.add(hospital);
		doctor.setHospitals(hos);
		return dr.save(doctor);
		

		
		
		
	}

	@Override
	public List<Hospital> fetchHospitals(String dname) {
		// TODO Auto-generated method stub
		List<Hospital> hos=null;
		int id=dr.findIdByName(dname);
		Doctor d=dr.findById(id).get();
		hos=d.getHospitals();
		return hos;
	}

	@Override
	public List<DoctorHospitalDto> getDoctorHospitals(int id) {
		// TODO Auto-generated method stub
		List<DoctorHospitalDto> dho=new ArrayList<>();
		List<Doctor> d=new ArrayList<>();
		List<Hospital> h=new ArrayList<>();
		DoctorHospitalDto dh=new DoctorHospitalDto();
		Doctor d1=dr.findById(id).get();
		d.add(d1);
		h.addAll(d1.getHospitals());
		dh.setDdto(d);
		dh.setHdto(h);
		dho.add(dh);
		return dho;
	}

	@Override
	public List<DoctorHospitalDto> getAllDoctorHospitals() {
		// TODO Auto-generated method stub
		int i;
		List<DoctorHospitalDto> dho=new ArrayList<>();
		List<Doctor> d=new ArrayList<>();
		d.addAll(getAllDoctors());
		for(i=0;i<d.size();i++) {
			List<Doctor> d2=new ArrayList<>();
			List<Hospital> h=new ArrayList<>();
			DoctorHospitalDto dh=new DoctorHospitalDto();
			Doctor d1=dr.findById(d.get(i).getId()).get();
			d2.add(d1);
			h.addAll(d1.getHospitals());
			dh.setDdto(d2);
			dh.setHdto(h);
			dho.add(dh);
		}
		return dho;

		
	}

	@Override
	public void deleteDoctor(int did, int hid) {
		// TODO Auto-generated method stub
		Doctor d=dr.getById(did);
		for(int i=0;i<d.getHospitals().size();i++) {
			if(d.getHospitals().get(i).getId()==hid) {
				d.getHospitals().remove(i);
			}
			dr.save(d);
					
		}
		
		
		

		
	}

	@Override
	public List<Doctor> getData(int did, int hid) {
		// TODO Auto-generated method stub
		Doctor d=dr.findById(did).get();
		Hospital h=hr.findById(hid).get();
		List<Doctor> list=new ArrayList<>();
		list.addAll(h.getDoctors());
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==d.getId()) {
				list.remove(i);
				break;
			}
		}
		return list;
		
	}

	/*@Override
	public void deleteDoctor(int did,int hid) {
		// TODO Auto-generated method stub
		Doctor d=dr.findById(did).get();
		Hospital h=hr.findById(hid).get();
		//List<Doctor> list=h.getDoctors();
		//System.out.println(list);
		for(int i=0;i<h.getDoctors().size();i++) {
			if(h.getDoctors().get(i).getId()==d.getId()) {
				//d.getHospitals().get(i).setDoctors(null);
				//dr.save(d);
				h.getDoctors().
				//d.getHospitals().get(i).setDoctors(null);
				hr.save(h);
				break;
				
				
			}
		}
	}*/
}
	
		


		
		
	
