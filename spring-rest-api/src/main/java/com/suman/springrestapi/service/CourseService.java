package com.suman.springrestapi.service;

import java.util.List;

import com.suman.springrestapi.entites.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long courseId);
	
}
