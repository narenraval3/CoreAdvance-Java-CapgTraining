package com.restdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.restdemo.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
