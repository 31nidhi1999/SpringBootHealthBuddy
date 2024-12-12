package com.project.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hospital extends BaseEntity {
	
	private String name;
	@Column(nullable = false,unique = true)
	private String contactNumber;
	private String location;
	private Boolean isActive;
	
	@ManyToMany
	private Set<Doctor> doctor;
}

