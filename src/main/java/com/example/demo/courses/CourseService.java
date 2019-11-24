package com.example.demo.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repo;
	
	
	
	public void addCourse(Course course) {
		repo.save(course);
	}
	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();
		repo.findAll().forEach(courses::add);;
		return courses; 
	}
	public void update(Course course,int id) {
		repo.deleteById(id);
		repo.save(course);
	}
	public void delete(int id) {
		repo.deleteById(id);
	}
}
