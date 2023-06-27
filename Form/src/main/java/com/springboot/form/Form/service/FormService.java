package com.springboot.form.Form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.form.Form.Repository.FormRepository;
import com.springboot.form.Form.model.Form;

@Service
public class FormService {
	@Autowired
private FormRepository repo;
	public Form saveForm(Form form) {
		return repo.save(form);
	}
	
}
