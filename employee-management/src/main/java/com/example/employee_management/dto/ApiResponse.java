package com.example.employee_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private String status;
    private T data;
    private List<Error> errors;
}
