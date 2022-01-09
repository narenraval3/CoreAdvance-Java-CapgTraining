package com.helloworldmvcapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.helloworldmvcapp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
