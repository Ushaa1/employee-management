package com.zynvixs.employee_management.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponse> handleDataIntegrityViolation(DataIntegrityViolationException ex) {
        String message = ex.getMostSpecificCause().getMessage();
        String customMessage;

        // Check which constraint was violated
        if (message.contains("email")) {
            customMessage = "This email already exists. Please use another email.";
        } else if (message.contains("contact")) {
            customMessage = "This contact number already exists. Please add another contact number.";
        } else {
            customMessage = "Database constraint violation: Duplicate entry detected.";
        }

        ErrorResponse errorResponse = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.CONFLICT.value(),
                "Conflict / Duplicate Entry",
                customMessage
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }
}