package edu.buffalo.cse.JAY.SpringWebServiceDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.buffalo.cse.JAY.SpringWebServiceDemo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
