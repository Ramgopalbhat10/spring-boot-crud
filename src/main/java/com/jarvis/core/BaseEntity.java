package com.jarvis.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;

	protected BaseEntity() {
		id = null;
	}
}
