package com.microservices.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.employeeservice.model.Employee;
import com.microservices.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping
	public Employee add(@RequestBody Employee employee) {
		return es.add(employee);
		
	}
	@GetMapping
	public List<Employee> findAll() {
		return es.findAll();
		
	}
	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") Long id) {
		return es.findById(id);
	}
	@GetMapping("/department/{departmentId}")
	public List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId) {
		return es.findByDepartment(departmentId);
	}
	

}
