package com.react.loginreg.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.loginreg.entity.AdminLogin;
import com.react.loginreg.entity.AdminRegistration;
import com.react.loginreg.entity.Login;
import com.react.loginreg.entity.LoginMessage;
import com.react.loginreg.entity.Registration;
import com.react.loginreg.serviceimpl.RegistrationServiceImpl;


@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/registration")
public class RegistrationController {
	@Autowired
	RegistrationServiceImpl rsimpl;
	@PostMapping("/save")
	public void saveRegisterUser(@RequestBody Registration registration ) {
		rsimpl.saveRegisterUser(registration);
		
	}
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody Login login) {
		LoginMessage msg=rsimpl.loginUser(login);
		return ResponseEntity.ok(msg);
	}
	@PostMapping("/adminlogin")
	public ResponseEntity<?> loginAdmin(@RequestBody AdminLogin adminlogin) {
		LoginMessage msg=rsimpl.loginAdmin(adminlogin);
		return ResponseEntity.ok(msg);
	}
	@PostMapping("/admin")
	public void saveAdminData(@RequestBody AdminRegistration areg) {
		rsimpl.saveAdminData(areg);
	}

	

}
