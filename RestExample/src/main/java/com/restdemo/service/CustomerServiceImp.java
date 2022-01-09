package com.restdemo.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restdemo.dao.CustomerRepository;
import com.restdemo.entities.Customer;
import com.restdemo.exception.CustomerException;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomer() {
		
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer custId) {
		
		return customerRepository.findById(custId).orElseThrow(CustomerException::new);
	}

}
