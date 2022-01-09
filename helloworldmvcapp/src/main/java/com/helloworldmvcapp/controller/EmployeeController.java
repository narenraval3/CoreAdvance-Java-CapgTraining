package com.helloworldmvcapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.helloworldmvcapp.exception.DatabaseRelatedException;
import com.helloworldmvcapp.exception.EmployeeNotFoundException;
import com.helloworldmvcapp.model.Employee;
import com.helloworldmvcapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")  //default HTTP get method will be handled here
	public  ModelAndView getEmployees()
	{
		Map mModel = new HashMap();
		List<Employee> emp = employeeService.getEmployees();
		mModel.put("emps", emp);
		
		ModelAndView modelAndView = new ModelAndView("employee", mModel);
		return modelAndView;
	}
	
////--------------------------------------------------------------------	
	//Explicitly declaring getAllEmployees method will gandle the get request from url localhost:8080/allemployees
	@RequestMapping(value="/allemployees", method=RequestMethod.GET)
	public  ModelAndView getAllEmployees()
	{
		Map employeeMap = new HashMap();
		List<Employee> empList = employeeService.getAllEmployees();
		employeeMap.put("empList", empList);
		
		ModelAndView modelAndView = new ModelAndView("allemployee", employeeMap);
		return modelAndView;
	}
	
	//Annotation is shortcut for line 35
	@GetMapping("/employees")
	public  ModelAndView getAllEmps()
	{
		Map employeeMap = new HashMap();
		List<Employee> empList = employeeService.getAllEmployees();
		employeeMap.put("empList", empList);
		
		ModelAndView modelAndView = new ModelAndView("allemployee", employeeMap);
		return modelAndView;
	}
	
////-------------------------------------------------------	
	//how to get data from client or from web page or from URL
	//two method to get data from URL- @RequestParam and @PathVariable
	//@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	
	@GetMapping("/addEmployee/{empId}/{empName}")
	public ModelAndView addEmployee(@PathVariable Integer empId, @PathVariable String empName) 
	{
		String successMsg = "Employee added susccessfully";
		String errorMsg = "Unable to add employee";
		
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		
		Boolean isEmployeeAdded = employeeService.addEmployee(employee);
		
		ModelAndView modelAndView;
		Map messageModel = new HashMap();
		
		if(isEmployeeAdded) 
		{
			messageModel.put("successmsg",successMsg);
			modelAndView = new ModelAndView("success",messageModel);
		}
		else {
				messageModel.put("errormsg",errorMsg);
				modelAndView = new ModelAndView("error",messageModel);
		}
		return modelAndView;
	}

////---------------------------------------------------------------------
	@GetMapping("/addEmployee1")
	public ModelAndView addEmployee1(@RequestParam(value="id") Integer empId, @RequestParam(value="name") String empName) 
	{
		String successMsg = "Employee added susccessfully";
		String errorMsg = "Unable to add employee";
		
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		
		Boolean isEmployeeAdded = employeeService.addEmployee(employee);
		
		ModelAndView modelAndView;
		Map messageModel = new HashMap();
		
		if(isEmployeeAdded) 
		{
			messageModel.put("successmsg",successMsg);
			modelAndView = new ModelAndView("success",messageModel);
		}
		else {
				messageModel.put("errormsg",errorMsg);
				modelAndView = new ModelAndView("error",messageModel);
		}
		return modelAndView;
	}
	
////--------------------------------------------------------------------
	//@RequestMapping(method=RequestMethod.POST)
	@PostMapping("/addEmployee2")
	public ModelAndView addEmployee(@ModelAttribute Employee employee) 
	{
		String successMsg = "Employee added susccessfully";
		String errorMsg = "Unable to add employee";
		
		Boolean isEmployeeAdded = employeeService.addEmployee(employee);
		
		ModelAndView modelAndView;
		Map messageModel = new HashMap();
		
		if(isEmployeeAdded) 
		{
			messageModel.put("emplData",employee);
			modelAndView = new ModelAndView("successWithData",messageModel);
		}
		else {
				messageModel.put("errormsg",errorMsg);
				modelAndView = new ModelAndView("error",messageModel);
		}
		return modelAndView;
	}
	
	@GetMapping("/employeeform")
	public ModelAndView getEmployeeForm(@ModelAttribute Employee employee)
	{
		ModelAndView modelAndView = new ModelAndView("addemployee");
		return modelAndView;
	}
	
////To delete the employee from the web page----------------------------------------
	@RequestMapping(value="/deleteEmployee/{empId}")
	public ModelAndView deleteEmployee(@PathVariable("empId") Integer empId) throws DataAccessException, EmployeeNotFoundException
	{
		this.employeeService.deleteEmployee(empId);
		
		Map messageModel = new HashMap();
		messageModel.put("empId", empId);
		
		ModelAndView modelAndView = new ModelAndView("deleteEmployee", messageModel);
		
		return modelAndView;
	}
////--------------------------------------------------------------------------------
	
//--//find an employee by its empId----------------------------------------------------
	@RequestMapping(value="/employeeDetails/{empId}", method=RequestMethod.GET)
	public ModelAndView getEmployeesByID(@PathVariable Integer empId) throws EmployeeNotFoundException
	{
		Map model = new HashMap();
		
		Employee employee = employeeService.getEmployeeByID(empId);
		
//		if(employee == null)
//		{
//			throw new EmployeeNotFoundException("Employee with Id--> " +String.valueOf(empId)+ " --is not found"); 
//		}
		
		if(employee == null) throw new EmployeeNotFoundException(empId); 		
		
		model.put("empDetails", employee);
		ModelAndView modelAndView = new ModelAndView("employeeDetails", model);
		
		return modelAndView;
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ModelAndView handleEmployeeNotFoundException(HttpServletRequest request, Exception ex)
	{
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("exception", ex);
		modelAndView.addObject("url", request.getRequestURL());
		
		modelAndView.setViewName("errorException");
		
		return modelAndView;
	}
	
	@ExceptionHandler(DatabaseRelatedException.class)
	public ModelAndView handleDatabaseRelatedException(HttpServletRequest request, Exception ex)
	{
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("exception", ex);
		modelAndView.addObject("url", request.getRequestURL());
		
		modelAndView.setViewName("errorException");
		
		return modelAndView;
	}
	
	
}
