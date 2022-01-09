package com.helloworldmvcapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.helloworldmvcapp.dao.EmployeeRepository;
import com.helloworldmvcapp.exception.EmployeeNotFoundException;
import com.helloworldmvcapp.model.Employee;

@Component
public class EmployeeServiceImplABC implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList = (List<Employee>) employeeRepository.findAll();
		return empList;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList = (List<Employee>) employeeRepository.findAll();
		return empList;
	}

	@Override
	public Boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = (Employee) employeeRepository.save(employee);
		
		if(emp!=null)
		{
			return true;
		}
		return false;
	}

////------------------------------------------------	

	@Override
	public Employee getEmployeeByID(Integer empId) {
		
		return employeeRepository.findById(empId).orElseThrow(EntityNotFoundException::new);				
	}

/////To delete the employee---------------------------------------------------------------	
	@Override
	public void deleteEmployee(Integer empId) throws DataAccessException, EmployeeNotFoundException {
		// TODO Auto-generated method stub
		employeeRepository.delete(getEmployeeByID(empId));
	}

	@Override
	public void deleteEmployee(Employee empId) throws DataAccessException {
		// TODO Auto-generated method stub
		
	}
	
}
