package com.restdemo.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.restdemo.exception.CustomerException;
import com.restdemo.exception.NoEmployeesException;

public class RestExampleExceptionHandler {
	
	@ExceptionHandler(NoEmployeesException.class)
	public ResponseEntity<Object> handleNonExistingEmployee(NoEmployeesException exception)
	{
		return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<Object> handleNonExistingCustomer(CustomerException exception)
	{
		return new ResponseEntity<>("Customer not found", HttpStatus.NOT_FOUND);
	}
}
