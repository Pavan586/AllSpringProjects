package com.springboot.form.Form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.myproject.Project.Entity.Student;
import com.springboot.form.Form.Repository.RegisterRepository;
import com.springboot.form.Form.model.Register;
@Service
public class RegisterService {
	@Autowired
	private RegisterRepository repo;
	public Register saveData(Register register) {
		return repo.save(register);
	}
	public Register getStudentById(int rid) {
		// TODO Auto-generated method stub
		return repo.findById(rid).get();
	}
	public List<Register> listAll() {
		return repo.findAll();
		
	}
	
	
	
}
