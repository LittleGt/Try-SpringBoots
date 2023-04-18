package com.example.Test.Test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Cus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length=50)
	private String name;
	
	@Column(nullable = true, length=99)
	private String description;
	
	public Cus(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
//	public void Cusmodel() {
//		
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
