package com.example.employee_management.exceptions;

import com.example.employee_management.dto.ApiResponse;
import com.example.employee_management.dto.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> methodArgumentValidation(MethodArgumentNotValidException exception) {
        List<Error> errors = new ArrayList<>();
        exception.getBindingResult().getAllErrors().forEach(error -> {
          //  String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.add(new Error("1001",  errorMessage));
        });
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(new ApiResponse<>("FAILURE", null, errors));
    }
}
