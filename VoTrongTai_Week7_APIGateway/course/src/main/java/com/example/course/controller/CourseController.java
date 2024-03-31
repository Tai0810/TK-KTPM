package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entity.Course;
import com.example.course.service.CouserService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private CouserService service;

	@GetMapping("/all")
	public List<Course> getALL() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Course getById(@PathVariable int id) {
		return service.getCourseById(id);
	}

	@PostMapping("/save")
	public Course save(@RequestBody Course course) {
		return service.save(course);
	}
}
