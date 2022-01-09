package com.restdemo.service;

import java.util.List;
import java.util.Optional;

import com.restdemo.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public List<Employee> getAllEmployees();
	
	public Boolean addEmployee(Employee employee);
	
	public Employee getEmployeeByID(Integer empId);	
	
}
