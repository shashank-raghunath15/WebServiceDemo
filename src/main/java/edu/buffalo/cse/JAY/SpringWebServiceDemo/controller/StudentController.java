package edu.buffalo.cse.JAY.SpringWebServiceDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.buffalo.cse.JAY.SpringWebServiceDemo.model.Student;
import edu.buffalo.cse.JAY.SpringWebServiceDemo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	private @Autowired StudentService studentService;
	
	@GetMapping("/{id}")
	public Student get(@PathVariable(name = "id") long id) {
		return studentService.get(id).get();
	}
	
	@GetMapping("/")
	public List<Student> getAll(){
		return studentService.getAll();
	}
	
	@PostMapping("/")
	public void addStudent(@RequestBody Student student) {
		System.out.println(student);
		studentService.addStudent(student);
	}
	
	@PutMapping("/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable(name = "id") long id) {
		studentService.updateStudent(student);
	}
}
