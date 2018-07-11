package edu.buffalo.cse.JAY.SpringWebServiceDemo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Faculty extends Person{

	private @OneToMany(mappedBy = "id") List<Course> courses = new ArrayList<>();
}
