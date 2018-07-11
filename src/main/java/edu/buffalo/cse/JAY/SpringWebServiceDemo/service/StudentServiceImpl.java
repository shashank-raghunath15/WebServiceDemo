package edu.buffalo.cse.JAY.SpringWebServiceDemo.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.buffalo.cse.JAY.SpringWebServiceDemo.model.Student;
import edu.buffalo.cse.JAY.SpringWebServiceDemo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private @Autowired StudentRepository studentRepository;

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		student.setJoiningDate(new Date());
		studentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
	}

	@Override
	public Optional<Student> get(long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}

}
