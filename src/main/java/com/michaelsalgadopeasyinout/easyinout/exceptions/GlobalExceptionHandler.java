package com.michaelsalgadopeasyinout.easyinout.exceptions;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BusinessException.class)
	public ResponseEntity<Map<String,String>> handleNotFound(BusinessException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
		.body(Map.of("error", ex.getMessage())); 
	}
    @ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Map<String,String>> handleNotFound(NotFoundException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
		.body(Map.of("error", ex.getMessage())); 
	}
}
