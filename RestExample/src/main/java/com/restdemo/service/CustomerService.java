package com.restdemo.service;

import java.util.List;

import com.restdemo.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomer();
	
	public Customer addCustomer(Customer customer);

	public Customer getCustomerById(Integer custId);
}
