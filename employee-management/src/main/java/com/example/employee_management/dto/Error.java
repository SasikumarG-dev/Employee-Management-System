package com.example.employee_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Error {
    private String errorCode;
    private String errorMessage;
}
