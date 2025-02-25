package com.wipro.springboot.usecase1;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }
    
    // Add Employee (POST)
    @PostMapping("/add")
    public EmployeePOJO addEmployee(
            @RequestParam String name, 
            @RequestParam String role) {
        return empService.addEmployee(name, role);
    }
    
    //To Get Employee by ID (GET)
    @GetMapping("/get")
    public EmployeePOJO getEmployee(@RequestParam int id) {
        return empService.getEmployee(id);
    }

    //To Update Employee Role (PUT)
    @PutMapping("/update")
    public EmployeePOJO updateEmployee(
            @RequestParam int id, 
            @RequestParam String newRole) {
        return empService.updateEmpRole(id, newRole);
    }
    
    //To Get All Employees (GET)
    @GetMapping("/all")
    public List<EmployeePOJO> getAllEmployees() {
        return empService.getAllEmployees();
    }

    
    //To Handle exceptions
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException(IllegalArgumentException ex) {
        return ex.getMessage();
    }
}
