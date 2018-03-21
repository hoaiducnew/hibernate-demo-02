package com.example.hibernatedemo02;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hibernatedemo02.entity.FullTimeEmployee;
import com.example.hibernatedemo02.entity.PartTimeEmployee;
import com.example.hibernatedemo02.repository.CourseRepository;
import com.example.hibernatedemo02.repository.EmployeeRepository;
import com.example.hibernatedemo02.repository.StudentRepository;

@SpringBootApplication
public class HibernateDemoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(HibernateDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		studentRepository.saveStudentWithPassport();
//		repository.playWithEntityManager();
		//courseRepository.addHardcodedReviewsForCourse();
//		List<Review> reviews = new ArrayList<>();
//		
//		reviews.add(new Review("5", "Great Hands-on Stuff."));	
//		reviews.add(new Review("5", "Hatsoff."));
//
//		courseRepository.addReviewsForCourse(10003L, reviews );	
		
		//courseRepository.addReviewsForCourse(10003L, reviews );
		
//		studentRepository.insertHardcodedStudentAndCourse();
//		studentRepository.insertStudentAndCourse(new Student("Jack"), 
//				new Course("Microservices in 100 Steps"));
		// Jack FullTimeEmployee salary - 10000$
		// Jill PartTimeEmployee - 50$ per hour
		employeeRepository.insert(new PartTimeEmployee("Jill", new BigDecimal("50")));
		employeeRepository.insert(new FullTimeEmployee("Jack", new BigDecimal("10000")));

		logger.info("All Employees -> {}", employeeRepository.retrieveAllEmployees());
	}
}
