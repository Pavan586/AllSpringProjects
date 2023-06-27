package com.onetoone.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onetoone.onetoone.Entity.Pancard;
import com.onetoone.onetoone.Entity.Student;
import com.onetoone.onetoone.Repository.PancardRepo;
import com.onetoone.onetoone.Repository.StudentRepo;

@SpringBootApplication
public class OnetooneApplication implements CommandLineRunner {
	@Autowired
	PancardRepo ob;
	@Autowired
	StudentRepo ob1;

	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1=new Student("student1");
		Student s2=new Student("student2");
		Pancard p1=new Pancard("pan1");
		Pancard p2=new Pancard("pan2");

		s1.setPancard(p1);
		s2.setPancard(p2);

		ob1.save(s1);
		ob1.save(s2);
		//ob1.delete(s2);
		
	}

}
