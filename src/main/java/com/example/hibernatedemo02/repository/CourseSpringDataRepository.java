package com.example.hibernatedemo02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hibernatedemo02.entity.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long> {

}