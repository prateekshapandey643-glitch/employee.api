package com.hkcs.employeeapi.controller;

import com.hkcs.employeeapi.model.Employee;
import com.hkcs.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create Employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get Employee By ID
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    // Update Employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable String id,
                                   @RequestBody Employee employee) {

        return employeeService.updateEmployee(id, employee);
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable String id) {

        return employeeService.deleteEmployee(id);
    }
}