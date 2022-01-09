package com.helloworldmvcapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Employee Not Found") //404
	public class EmployeeNotFoundException extends Exception 
	{
		public EmployeeNotFoundException() 
		{  
			//
		}
		
		public EmployeeNotFoundException(Integer id)
		{
		 super("EmployeeNotFoundException with id="+id);
		}
	}

/* public class EmployeeNotFoundException extends RuntimeException{
 * 
 * private String message;
 * 
 * public EmployeeNotFoundException() { // TODO Auto-generated constructor stub
 * }
 * 
 * public EmployeeNotFoundException(String message, Throwable cause, boolean
 * enableSuppression, boolean writableStackTrace) { super(message, cause,
 * enableSuppression, writableStackTrace); // TODO Auto-generated constructor
 * stub }
 * 
 * public EmployeeNotFoundException(String message, Throwable cause) {
 * super(message, cause); // TODO Auto-generated constructor stub }
 * 
 * public EmployeeNotFoundException(String message) { super(message); // TODO
 * Auto-generated constructor stub }
 * 
 * public EmployeeNotFoundException(Throwable cause) { super(cause); // TODO
 * Auto-generated constructor stub }
 * 
 * }
 */