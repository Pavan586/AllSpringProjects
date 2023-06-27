package com.onetoone.onetoone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.onetoone.Entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
