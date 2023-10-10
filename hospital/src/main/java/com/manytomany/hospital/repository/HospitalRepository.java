package com.manytomany.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.manytomany.hospital.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	@Query("select h.id from Hospital h where h.name=?1")
	public int findIdByHospitalName(String name);


}
