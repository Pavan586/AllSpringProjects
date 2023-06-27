package com.microservices.employeeservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservices.employeeservice.model.Employee;
import com.microservices.employeeservice.repository.EmployeeRepository;

@Component
public class EmployeeService {
	@Autowired
	EmployeeRepository er;

	public Employee add(Employee employee) {
		// TODO Auto-generated method stub
		return er.save(employee);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	public Employee findById(Long id) {
		// TODO Auto-generated method stub
		return er.findById(id).get();
	}

	public List<Employee> findByDepartment(Long departmentId) {
		// TODO Auto-generated method stub
		List<Employee> emp=this.findAll();
		return  emp.stream()
				.filter(a->a.getDid().equals(departmentId))
						.toList();
	}

}
