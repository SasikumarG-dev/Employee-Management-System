package com.example.employee_management.controller;

import com.example.employee_management.dto.ApiResponse;
import com.example.employee_management.entity.Employee;
import com.example.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<ApiResponse<Employee>> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(
                new ApiResponse<>("Success",
                        employeeService.saveEmployee(employee),
                        null)
        );
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<ApiResponse<Employee>> viewEmployeeById(@PathVariable Integer employeeId){
        return ResponseEntity.ok(
                new ApiResponse<>("Success",
                        employeeService.viewEmployeeById(employeeId),
                        null)
        );
    }
}
