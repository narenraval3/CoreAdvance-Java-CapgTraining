package com.helloworldmvcapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;

import com.helloworldmvcapp.exception.EmployeeNotFoundException;
import com.helloworldmvcapp.model.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public List<Employee> getAllEmployees();
	
	public Boolean addEmployee(Employee employee);
	
	public void deleteEmployee(Integer empId) throws DataAccessException, EmployeeNotFoundException;
	public void deleteEmployee(Employee empId) throws DataAccessException;
	
	public Employee getEmployeeByID(Integer empId);
	
	
	
	
	
}
