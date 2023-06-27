package com.springboot.form.Form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.form.Form.Repository.LoginRepository;
import com.springboot.form.Form.Repository.RegisterRepository;
import com.springboot.form.Form.model.Form;
import com.springboot.form.Form.model.Login;
import com.springboot.form.Form.model.Register;

@Service
public class LoginService {
	@Autowired
	private LoginRepository repo;
	public Login saveData(Login login) {
		return repo.save(login);
	}
	
	

}
