package com.springboot.form.Form.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.form.Form.model.Form;

public interface FormRepository extends JpaRepository<Form, Integer>{

}
