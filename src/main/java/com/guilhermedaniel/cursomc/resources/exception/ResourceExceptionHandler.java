package com.guilhermedaniel.cursomc.resources.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.guilhermedaniel.cursomc.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StandardError> objectNotFound (ObjectNotFoundException e, HttpServletRequest request) {
		 StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), Instant.now());
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
