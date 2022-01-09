package com.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.entities.Employee;
import com.restdemo.service.EmployeeService;

@RestController //---->@Controller + @ResponseBody
public class EmployeeController {
	
	@Autowired 
	EmployeeService employeeService;

////------------------------------------------------------------------------------------
	@GetMapping("/greeting/{name}")
	public String displayGreeting(@PathVariable String name)
	{
		return "Hello " +name;
	}

	@GetMapping("/greeting1/{name}")    
	public String displayGreeting1(@RequestParam String name) //in the form of query
	{
		return "Hello " +name;
	}

////--------------------------------------------------------------------------------------
	@GetMapping("/employees")
	public List<Employee> getEmployees() 
	{
		return employeeService.getEmployees();
	}
	
////---------------------------------------------------------------------------------------
	@GetMapping("/allEmployees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}

////-----------------------------------------------------------------------------------------
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{
		Boolean isEmployeeAdded = employeeService.addEmployee(employee);
		
		if(isEmployeeAdded)
		{
			return "Employee Addded Successfully!!..";
		}
		else {
			return "Unable to Addded Employee!!..";
		}	
	}		
}
