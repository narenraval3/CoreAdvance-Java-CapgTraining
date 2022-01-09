package com.restdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.restdemo.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{


}
