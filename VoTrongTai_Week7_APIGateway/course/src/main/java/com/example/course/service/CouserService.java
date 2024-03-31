package com.example.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entity.Course;
import com.example.course.repository.CourseRepository;

@Service
public class CouserService {
	@Autowired
	private CourseRepository repository;
	
	public List<Course> getAll() {
		return repository.findAll();
	}

	public Course getCourseById(int id) {
		return repository.getById(id);
	}

	public Course save(Course d) {
		return repository.save(d);

	}
}
