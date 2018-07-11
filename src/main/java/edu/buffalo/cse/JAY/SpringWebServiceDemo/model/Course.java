package edu.buffalo.cse.JAY.SpringWebServiceDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	private @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
	private String title;
	private @ManyToOne Faculty faculty;
	private int capacity;
	private Grading grading;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Grading getGrading() {
		return grading;
	}
	public void setGrading(Grading grading) {
		this.grading = grading;
	}
	
	
}
