package com.jarvis.core;

import com.jarvis.course.Course;
import com.jarvis.course.CourseRepository;
import com.jarvis.review.Review;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements ApplicationRunner {

	private final CourseRepository courseRepository;

	public DatabaseLoader(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Course course = new Course("Java Basics", "https://xyzlearning.com/library/java-basics");
		course.addReview(new Review(3, "Best Beginner course"));
		courseRepository.save(course);
	}
}
