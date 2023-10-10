package com.manytomany.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.manytomany.hospital.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> { 
	@Query("select d.id from Doctor d where d.name=?1")
	public int findIdByName(String name);


}
