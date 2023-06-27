package com.springboot.form.Form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.form.Form.model.Register;
import com.springboot.form.Form.service.LoginService;
import com.springboot.form.Form.service.RegisterService;

@Controller
public class RegisterController {
	@Autowired
	private RegisterService  service;
	@Autowired
	private LoginService ser;
	@GetMapping("/register")
	public String loginPage(Register register) {
		return "register";
	}
	@PostMapping("/register/wel")
	public String saveFormData(@ModelAttribute("register") Register register) {
		service.saveData(register);
		return "wel";
	}
	
	

}
