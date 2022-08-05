package com.suman.springrestapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suman.springrestapi.dao.CourseDao;
import com.suman.springrestapi.entites.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	//List<Course> listOfCourse;
	
	public CourseServiceImpl() {
//		listOfCourse = new ArrayList<>();
//		listOfCourse.add(new Course(101,"Core Java", " this course contains basic concept of Java"));
//		listOfCourse.add(new Course(102,"Spring JPA", " this course contains the DB connectivity"));
//		listOfCourse.add(new Course(103,"Spring Rest", "this course contains Rest Api details"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {

//		Course cs=null;
//		for(Course course: listOfCourse) {
//			if(course.getId()==courseId) {
//				cs= course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		//listOfCourse.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		listOfCourse.forEach(e ->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//				}
//		});
		courseDao.save(course);
		return course;
		
	}

	@Override
	public void deleteCourse(long courseId) {
		//this.listOfCourse=listOfCourse.stream().filter(e -> e.getId() != courseId).collect(Collectors.toList());
		Course course= courseDao.getOne(courseId);
		courseDao.delete(course);
	
	}

}
