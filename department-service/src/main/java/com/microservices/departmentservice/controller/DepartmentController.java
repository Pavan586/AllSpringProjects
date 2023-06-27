package com.microservices.departmentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.departmentservice.model.Department;
import com.microservices.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	DepartmentService ds;
	@PostMapping
	public Department add(@RequestBody Department department) {
		return ds.add(department); 
	}
	@GetMapping
	public List<Department> findAll() {
		return ds.findAll();
	}
	@GetMapping("/{id}")
	public Department findById(@PathVariable Long id) {
		return ds.findById(id);
		
	}
	@GetMapping("/withemployees")
	public List<Department> findAllWithEmployees() {
		return ds.findAllWithEmployees();
	}

}
