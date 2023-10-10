package com.react.loginreg.repository;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.react.loginreg.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	//Optional<Registration> findOneByEmailAndPassword(String userEmail,String userPassword);
	//Registration findByEmail(String userEmail);
	@Query("select r from Registration r where r.userEmail=?1")
	public com.react.loginreg.entity.Registration findByEmail(String userEmail);
	@Query("select r from Registration r where r.userEmail=?1 and r.userPassword=?2")
	public Registration findByEmailAndpassword(String userEmail,String userPassword);

	
	

}
