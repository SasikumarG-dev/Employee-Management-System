package com.example.employee_management.dto;

import com.example.employee_management.validation.ValidAge;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class EmployeeRequest {
    @Id
    private Integer employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    @NotNull(message = "Enter Date of Birth")
    @ValidAge
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoin;
    private String address;
    private Integer departmentId;
}
