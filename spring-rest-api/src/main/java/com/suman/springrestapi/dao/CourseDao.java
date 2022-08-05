package com.suman.springrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suman.springrestapi.entites.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
