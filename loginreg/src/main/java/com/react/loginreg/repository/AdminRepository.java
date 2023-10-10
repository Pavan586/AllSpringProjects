package com.react.loginreg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.react.loginreg.entity.AdminRegistration;



public interface AdminRepository extends JpaRepository<AdminRegistration,Integer> {
	@Query("select a from AdminRegistration a where a.aemail=?1")
	public AdminRegistration findByEmail(String aemail);
	@Query("select a from AdminRegistration a where a.aemail=?1 and a.apassword=?2")
	public AdminRegistration findByEmailAndpassword(String aemail,String apassword);


}
