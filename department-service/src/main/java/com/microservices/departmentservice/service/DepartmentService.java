package com.microservices.departmentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservices.departmentservice.client.EmployeeClient;
import com.microservices.departmentservice.model.Department;
import com.microservices.departmentservice.repository.DepartmentRepository;
@Component
public class DepartmentService {
	@Autowired
	EmployeeClient employeeClient;
	@Autowired
	DepartmentRepository dr;

	public Department add(Department department) {
		// TODO Auto-generated method stub
		return dr.save(department);
	}

	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

	public Department findById(Long id) {
		// TODO Auto-generated method stub
		return dr.findById(id).get();
	}

	public List<Department> findAllWithEmployees() {
		// TODO Auto-generated method stub
		List<Department> departments=dr.findAll();
		departments.forEach(department->department.setEmployees(employeeClient.findByDepartment(department.getDid())));
		return departments;
	}

}
