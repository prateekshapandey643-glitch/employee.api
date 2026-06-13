package com.hkcs.employeeapi.repository;

import com.hkcs.employeeapi.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}