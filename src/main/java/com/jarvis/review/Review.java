package com.jarvis.review;

import com.jarvis.core.BaseEntity;
import com.jarvis.course.Course;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Review extends BaseEntity {

	private int rating;
	private String description;
	@ManyToOne
	private Course course;

	// TODO: duplicating code for every single entity.
	protected  Review() {
		super();
	}

	public Review(int rating, String description) {
		this.rating = rating;
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
