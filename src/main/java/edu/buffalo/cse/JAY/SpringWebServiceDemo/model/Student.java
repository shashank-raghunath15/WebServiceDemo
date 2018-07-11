package edu.buffalo.cse.JAY.SpringWebServiceDemo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Student extends Person{

	private @ManyToMany List<Course> courses = new ArrayList<>();
	private String gpa;
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [courses=" + courses + ", gpa=" + gpa + ", getCourses()=" + getCourses() + ", getGpa()="
				+ getGpa() + ", getId()=" + getId() + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getJoiningDate()=" + getJoiningDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
}
