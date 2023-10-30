package com.example.demo.Component;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class Task {
	
	private Long id;
	private String titel;
	private String description;
	private boolean isCompleted;
	
	public Task() {
		
	}
	
	public Task(Long id, String titel, String description, boolean isCompleted) {
		this.id = id;
		this.titel = titel;
		this.description = description;
		this.isCompleted = isCompleted;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
}
