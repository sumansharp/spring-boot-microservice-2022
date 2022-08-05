package com.suman.springrestapi.controller;

//(part1): https://www.youtube.com/watch?v=sdDDuQuX2cg
//(part2): https://www.youtube.com/watch?v=V2p5rVIBT5M

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suman.springrestapi.entites.Course;
import com.suman.springrestapi.service.CourseService;

@RestController
public class CourseApiController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		
		return "Welcome to Cources Application";
	}
	
	// get all cources
	@GetMapping("/courses")
	public List<Course> getCourses() {
		
		return this.courseService.getCourses();
	}
	//get single course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	//@RequestMapping(path="/courses", method= RequestMethod.POST )
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
		try {
		this.courseService.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
			//return new ResponseEntity<>(HttpStatus.valueOf("There is error occured"));
		}
		
	}
}
