package com.wipro.springboot.usecase1;

public class EmployeePOJO {
	
	//private variables
	private int id;
	private String name;
	private String role;
	
	public EmployeePOJO(int id, String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	//getters and setters
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "EmployeePOJO [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	

}
