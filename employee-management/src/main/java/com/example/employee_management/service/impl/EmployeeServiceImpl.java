package com.example.employee_management.service.impl;

import com.example.employee_management.entity.Employee;
import com.example.employee_management.repository.EmployeeRepository;
import com.example.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee viewEmployeeById(Integer employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public List<Employee> viewAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Integer employeeId, Employee employee) {

        return employeeRepository.save(employee);
    }
}
