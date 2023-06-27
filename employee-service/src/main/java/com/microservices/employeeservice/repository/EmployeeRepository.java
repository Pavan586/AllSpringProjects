package com.microservices.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.employeeservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
