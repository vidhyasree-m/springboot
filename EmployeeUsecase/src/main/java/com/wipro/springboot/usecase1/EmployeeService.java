package com.wipro.springboot.usecase1;

import java.util.List;

import org.springframework.stereotype.Service;
 
@Service
public class EmployeeService {
	
	private final EmployeeRepo empRepo;
	
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	//Add employee
	public EmployeePOJO addEmployee(String name, String role) {
		String assignedRole = assignRole(role);
		return empRepo.persist(name, assignedRole);
		
	}
	//Get employee by ID
	public EmployeePOJO getEmployee(int id) {
        EmployeePOJO employee = empRepo.getById(id);
        if (employee == null) {
            throw new IllegalArgumentException("Employee not found with ID: " + id);
        }
        return employee;
    }
    
	//Update employee role using id
    public EmployeePOJO updateEmpRole(int id, String newRole) {
        EmployeePOJO employee = empRepo.updateRole(id, assignRole(newRole));
        if (employee == null) {
            throw new IllegalArgumentException("Employee not found with ID: " + id);
        }
        return employee;
    }
    //To get all employees
    public List<EmployeePOJO> getAllEmployees() {
        return empRepo.getAllEmployees();
    }

    //To give role
    private String assignRole(String role) {
        if (role == null) {
            throw new IllegalArgumentException("Role cannot be null");
        }
        String lowerCaseRole = role.trim().toLowerCase(); 
        switch (lowerCaseRole) {
            case "developer":
                return "Developer";
            case "tester":
                return "Tester";
            case "architect":
                return "Architect";
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }

 }

	
	


