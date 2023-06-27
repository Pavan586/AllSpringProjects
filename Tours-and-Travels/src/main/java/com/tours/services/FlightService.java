package com.tours.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tours.models.Flight;
import com.tours.repos.FlightRepository;

@Service
public class FlightService {

	@Autowired FlightRepository repo;
	
	public void saveFlight(Flight flight) {
		repo.save(flight);
	}
	
	public List<Flight> listall(){
		return repo.findAll();
	}
	
	public Flight findById(int id) {
		return   repo.getById(id);
	}
	/*public List<Flight> getAllStudents() {
		return repo.findAll();
	}*/
	public Flight saveStudent(Flight student) {
		return repo.save(student);
	}
	public void deleteStudentById(int id) {
		repo.deleteById(id);
	}

	public Flight updateStudent(Flight student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	
}
