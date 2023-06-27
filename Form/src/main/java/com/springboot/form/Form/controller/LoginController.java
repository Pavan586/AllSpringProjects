package com.springboot.form.Form.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.form.Form.model.Login;
import com.springboot.form.Form.model.Register;
import com.springboot.form.Form.service.LoginService;
import com.springboot.form.Form.service.RegisterService;

@Controller
public class LoginController {
	@Autowired
	private LoginService ser;
	@Autowired
	private RegisterService serv;
	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	/*@PostMapping("/login/log") 
	public String loginData(Login login,Register register,String uname,String password,ModelMap model) {
		uname=login.getUname();
		password=login.getPassword();
		model.put("uname",uname);
		model.put("password", password);
		
		ser.saveData(login);
		uname=login.getUname();
		password=login.getPassword();
		
		if(uname.equalsIgnoreCase(rname) && password.equalsIgnoreCase(rpassword)) {
			model.put("message","Login Successfull");
			return "log";
		} else {
			model.put("message1", "Invalid credentials");
			return "login";
		}
	}
			List<Register> list=new ArrayList<>();
			//List<Register> li=new ArrayList<>();
			serv.listAll().forEach(e->list.add(e));

			//System.out.println(li);
			if(list.contains(uname)) {
				return "log";
			} else {
				model.put("message", "Invalid credentials");
				
				return "login";
			}*/
	@PostMapping("/login/log") 
	public String loginData(Login login,Register register,String uname,String password,ModelMap model) {
		int i,j,k=0;
		
		ser.saveData(login);
		uname=login.getUname();
		password=login.getPassword();
		model.put("uname",uname);
		model.put("password", password);
		List<Register> list=new ArrayList<>();
		List<String> li=new ArrayList<>();
		List<String> lip=new ArrayList<>();
		serv.listAll().forEach(e->list.add(e));
		for(Register registers:list) {
			li.add(registers.getRname());
		}
		for(Register registers:list) {
			lip.add(registers.getRpassword());
		}
		for(i=0;i<li.size();i++) {	
			
			if((li.get(i)).equals(uname)) {
				k++;
				break;
				
			}
		}
		if((lip.get(i)).equals(password)) {
			k++;
		}
		if(k==2) {
			return "log";
		} else {
			return "login";
		}
		
		/*if(li.contains(uname) && (lip.contains(password))) {
			return "log";
		} else {
			model.put("message", "Invalid credentials");
			
			return "login";
		}*/
		/*for(Register registers:list) {
			if(registers.getRname().equals(uname)) {
				return "log";
			}
				
			}*/
		}
		
			
		
}
	
	
		
		
		
	



