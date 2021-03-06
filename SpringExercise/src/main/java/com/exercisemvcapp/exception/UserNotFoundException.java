package com.exercisemvcapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
	
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="User Not Found") //404
public class UserNotFoundException extends Exception 
{
	public UserNotFoundException() 
	{  
		//
	}
	
	public UserNotFoundException(Integer id)
	{
		 super("UserNotFoundException with id="+id);
	}
}
