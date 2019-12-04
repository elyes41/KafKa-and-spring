package com.example.kafka.demo.model;

public class User {

	
	private String name;
	private String department;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	public User() {
	}
	
}
