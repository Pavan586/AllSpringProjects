package com.springboot.form.Form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.form.Form.model.Form;
import com.springboot.form.Form.service.FormService;


@Controller
public class FormController {
	@Autowired
	private FormService service;
	@GetMapping("/user")
	public String userData() {
		return "form";
	}
	@PostMapping("/user/welcome")
	public String saveForm(@ModelAttribute("form") Form form) {
		service.saveForm(form);
		return "welcome";
	}
	
}
