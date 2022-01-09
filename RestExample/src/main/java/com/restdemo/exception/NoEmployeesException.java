package com.restdemo.exception;

public class NoEmployeesException extends RuntimeException{

	public NoEmployeesException() {
		// TODO Auto-generated constructor stub
	}

	public NoEmployeesException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NoEmployeesException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoEmployeesException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoEmployeesException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
