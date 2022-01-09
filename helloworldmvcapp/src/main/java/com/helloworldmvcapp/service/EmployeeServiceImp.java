//package com.helloworldmvcapp.service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Component;
//
//import com.helloworldmvcapp.model.Employee;
//
//@Component
//public class EmployeeServiceImp implements EmployeeService{
//
//	@Override
//	public List<Employee> getEmployees() {
//		
//		List<Employee> empList = new ArrayList();
//		
//		Employee emp = new Employee();
//		emp.setEmpId(39);
//		emp.setEmpName("Naren");
//		empList.add(emp);
//		
//		Employee emp1 = new Employee();
//		emp1.setEmpId(41);
//		emp1.setEmpName("Vivak");
//		empList.add(emp1);
//		
//		return empList;
//	}
//
//	//--------------------------------------
//	@Override
//	public List<Employee> getAllEmployees() {
//		
//		List<Employee> empList2 = new ArrayList();
//		
//		Employee emp2 = new Employee();
//		emp2.setEmpId(11);
//		emp2.setEmpName("Aryan");
//		empList2.add(emp2);
//		
//		Employee emp3 = new Employee();
//		emp3.setEmpId(22);
//		emp3.setEmpName("Scott");
//		empList2.add(emp3);
//		
//		return empList2;
//	}
//
//	@Override
//	public Boolean addEmployee(Employee employee) {
//		
//		List<Employee> emplist = new ArrayList();
//		
//		//if(employee.getEmpId() >1)
//		if(!employee.getEmpName().isEmpty()) //for Post
//		{
//			emplist.add(employee);
//		}
//		else {
//			return false;
//		}
//		return true;
//	}
//
//	@Override
//	public Employee getEmployeeByID(Integer empId) {
//		
//		Employee employee = new Employee();
//		employee.setEmpId(99);
//		employee.setEmpName("Jack Sparrow");
//		
//		if(employee.getEmpId() == empId)
//		{
//			return employee;
//		}
//		return null;
//	}
//}
