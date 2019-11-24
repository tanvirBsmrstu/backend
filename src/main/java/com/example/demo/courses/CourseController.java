package com.example.demo.courses;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {

	@Autowired
	private CourseService service ;
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	List<Course> getAllCourses() {
		return service.getAllCourses();
	}
	
	@RequestMapping(value="/addCourse",method=RequestMethod.POST)
	String addCourse(@RequestBody Course course) {
		
		service.addCourse(course);
		
		return course.getCourseName()+" is added...";
	}
	
	
	@RequestMapping(value = "/courses/{id}/delete",method = RequestMethod.DELETE)
	String deleteCourse(@PathVariable int id) {
		
		service.delete(id);
		return  "deleted";
	}
	
	
	@RequestMapping(value = "/courses/{id}/update", method = RequestMethod.PUT)
	String updateCourse(@RequestBody Course course,@PathVariable int id) {
		
		service.update(course, id);
		return "updated";
	}
	
	
}
