package com.example.employee_management.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private Integer employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateOfBirth;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateOfJoin;
    private String address;
    private Integer departmentId;

}
