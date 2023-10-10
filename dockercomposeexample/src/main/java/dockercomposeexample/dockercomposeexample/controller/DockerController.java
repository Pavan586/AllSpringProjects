package dockercomposeexample.dockercomposeexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dockercomposeexample.dockercomposeexample.entity.Student;
import dockercomposeexample.dockercomposeexample.service.DockerService;

@RestController
@RequestMapping("/student")
public class DockerController {
	@Autowired
	DockerService ss;
	@PostMapping("/add")
	public void saveStudent(@RequestBody Student student) {
		ss.save(student);
	}
	@GetMapping("/get")
	public List<Student> getStudents() {
		return ss.getAll();
	}

}
