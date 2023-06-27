package com.springboot.form.Form.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.el.parser.AstListData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.form.Form.model.Register;
import com.springboot.form.Form.service.RegisterService;

@RestController
public class RegController {
	@Autowired
	private RegisterService service;
	@GetMapping("/get/{id}")
	public Register editStudentForm(@PathVariable("id") int id) {
		return service.getStudentById(id);

		
	}
	/*@GetMapping("/list")
	public String getAllData() {
		List<Register> list=new ArrayList<>();
		List<String> li=new ArrayList<>();
		service.listAll().forEach(e->list.add(e));
		for(Register register:list) {
			li.add(register.getRname());
		}
		System.out.print(li);
		
	}*/
	
	

}
