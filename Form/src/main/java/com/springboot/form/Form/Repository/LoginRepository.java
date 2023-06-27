package com.springboot.form.Form.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.form.Form.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {
	

}
