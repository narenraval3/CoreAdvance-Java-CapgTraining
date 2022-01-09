package com.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.entities.Customer;
import com.restdemo.exception.CustomerException;
import com.restdemo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping(value="/customers", produces = {MediaType.APPLICATION_XML_VALUE})
	public List<Customer> getAllCustomer()
	{
		List<Customer> customerList = customerService.getAllCustomer();	
		return customerList;
	}
	
	//@PostMapping(value="/customer", produces = {}, consumes = {MediaType.APPLICATION_XML_VALUE})
	//@PostMapping("/customer", consumes = {MediaType.APPLICATION_XML_VALUE})
	@PostMapping(value="/customer", consumes = {MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public Customer addCustomer(@RequestBody Customer customer) 
	{
		return customerService.addCustomer(customer);
	}

/////----------Exception----------------------------------------------------------------
	@GetMapping("/customerByid/{custId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Integer custId)
	{
		Customer customer = customerService.getCustomerById(custId);
		
		if(customer!=null)
		{
			return new ResponseEntity<>(customer, HttpStatus.OK);
		}
		else {
			throw new CustomerException("Not Found");
		}
	}
	

}
