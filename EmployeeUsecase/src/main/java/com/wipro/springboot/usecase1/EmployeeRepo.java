package com.wipro.springboot.usecase1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {
	
	//creating HashMap
	private Map<Integer, EmployeePOJO> empMap = new HashMap<>();
	private int idValue = 1;
	
	//To add employee
	public EmployeePOJO persist(String name, String role) {
		EmployeePOJO employee = new EmployeePOJO(idValue, name, role);
		empMap.put(idValue, employee);
		idValue++;
		return employee;
	}
	//To get employee by id
	public EmployeePOJO getById(int id) {
		return empMap.get(id);
	}
	
	//To update role
	public EmployeePOJO updateRole(int id, String newRole) {
		EmployeePOJO employee = empMap.get(id);
		if(employee != null) {
			employee.setRole(newRole);
		}
		return employee;
	}
	
	//To get all employees
	public List<EmployeePOJO> getAllEmployees() {
	    return new ArrayList<>(empMap.values());
	}

}
