package com.example.employee_management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Department {
    @Id
    private Integer departmentId;
    private String departmentName;
    @OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentId", referencedColumnName = "departmentId")
    private List<Employee> employees;
}
