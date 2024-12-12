package com.hospital.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@MappedSuperclass  //supper class of all the entities present in our DB
public class BaseEntity {
	
	//primary key of the tables, strategy Auto Increment by MYSQL DB
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@CreatedDate
	@Column(name = "created_on")
	private LocalDate createdOn;
	
	@CreationTimestamp
	@Column(name="updated_on")
	private LocalDateTime uodatedOn;
}
