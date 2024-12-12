package com.project.entities;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//class level annotation to specify following is a base class from which other  entities will inherit , no separate table
@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
	@Id
	private Long Id;
	
	@CreatedDate
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalTime updatedDate;
}
