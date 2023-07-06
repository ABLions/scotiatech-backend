package com.scotia.todo.entities;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name="tasks")
@Data
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String description;
	
	private String status;

}
