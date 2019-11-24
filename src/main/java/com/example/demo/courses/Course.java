package com.example.demo.courses;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	private String courseName;
	@Id
	private int id;
	private String description;
	
	Course(){super();}
	Course(String _name, int _id, String _description){
		super();
		courseName = _name;
		id = _id;
		description = _description;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
