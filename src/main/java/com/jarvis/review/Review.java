package com.jarvis.review;

import com.jarvis.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Review extends BaseEntity {

	private String rating;
	private String description;

	// TODO: duplicating code for every single entity.
	protected  Review() {
		super();
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
