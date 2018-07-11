package edu.buffalo.cse.JAY.SpringWebServiceDemo.service;

import java.util.List;
import java.util.Optional;

import edu.buffalo.cse.JAY.SpringWebServiceDemo.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> getAll();

	public void updateStudent(Student student);

	public Optional<Student> get(long id);

}
