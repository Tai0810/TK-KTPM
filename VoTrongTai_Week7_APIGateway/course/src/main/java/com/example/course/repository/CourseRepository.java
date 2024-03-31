package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	@Query("select c from Course c where c.id =:id")
	public Course getById(@Param("id") int id);
}
