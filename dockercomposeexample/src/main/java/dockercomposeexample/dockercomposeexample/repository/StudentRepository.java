package dockercomposeexample.dockercomposeexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dockercomposeexample.dockercomposeexample.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
