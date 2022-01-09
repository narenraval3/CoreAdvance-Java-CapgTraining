package com.restdemo.service;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restdemo.dao.EmployeeRepository;
import com.restdemo.entities.Employee;


@Component
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmployees() {
		
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Boolean addEmployee(Employee employee) {
		
		Employee emp = employeeRepository.save(employee);
		
		if(emp!=null)
		{
			return true;
		}
		return false;
	}

	@Override
	public Employee getEmployeeByID(Integer empId) {
		
		return employeeRepository.findById(empId).orElseThrow(EntityNotFoundException::new);
	}

	/*
	 * @Override public List<Employee> getEmployees() {
	 * 
	 * List<Employee> empList = new ArrayList();
	 * 
	 * Employee emp = new Employee(); emp.setEmpId(39); emp.setEmpName("Naren");
	 * empList.add(emp);
	 * 
	 * Employee emp1 = new Employee(); emp1.setEmpId(41); emp1.setEmpName("Vivak");
	 * empList.add(emp1);
	 * 
	 * return empList; }
	 * 
	 * //---------------------------------------------------------------------------
	 * -------------
	 * 
	 * @Override public List<Employee> getAllEmployees() {
	 * 
	 * List<Employee> empList2 = new ArrayList();
	 * 
	 * Employee emp2 = new Employee(); emp2.setEmpId(11); emp2.setEmpName("Aryan");
	 * empList2.add(emp2);
	 * 
	 * Employee emp3 = new Employee(); emp3.setEmpId(22); emp3.setEmpName("Scott");
	 * empList2.add(emp3);
	 * 
	 * return empList2; }
	 * 
	 * ////-------------------------------------------------------------------------
	 * --------------
	 * 
	 * @Override public Boolean addEmployee(Employee employee) { // TODO
	 * Auto-generated method stub List<Employee> emplist = new ArrayList();
	 * 
	 * if(employee.getEmpId() >1) { emplist.add(employee); } else { return false; }
	 * return true; }
	 * 
	 * ////-------------------------------------------------------------------------
	 * --------------
	 * 
	 * @Override public Employee getEmployeeByID(Integer empId) { // TODO
	 * Auto-generated method stub Employee employee = new Employee();
	 * employee.setEmpId(99); employee.setEmpName("Jack Sparrow");
	 * 
	 * if(employee.getEmpId() == empId) { return employee; } return null; }
	 */
}
