package dockercomposeexample.dockercomposeexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dockercomposeexample.dockercomposeexample.entity.Student;
import dockercomposeexample.dockercomposeexample.repository.StudentRepository;
@Component
public class DockerService {
	@Autowired
	StudentRepository sr;

	public void save(Student student) {
		// TODO Auto-generated method stub
		sr.save(student);
		
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
