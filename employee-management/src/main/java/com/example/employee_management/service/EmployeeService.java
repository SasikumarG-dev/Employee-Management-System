package com.example.employee_management.service;

import com.example.employee_management.dto.EmployeeRequest;
import com.example.employee_management.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Employee saveEmployee(EmployeeRequest employee);
    Employee viewEmployeeById(Integer employeeId);
    List<Employee> viewAllEmployee();
    Employee updateEmployee(Integer employeeId, Employee employee);
}
