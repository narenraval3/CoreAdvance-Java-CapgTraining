package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="customer_details")

@NamedQueries(
		{
			@NamedQuery(name="getAllCustomer", query="select customer from Customer customer"),
			@NamedQuery(name="getCustomerByName", query="select customer from Customer customer where customer.custName=:name")
		})

public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer custId;
	private String custName;
	
	@Transient
	private String custSecretCode;
	
	public Customer() {
		
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustSecretCode() {
		return custSecretCode;
	}

	public void setCustSecretCode(String custSecretCode) {
		this.custSecretCode = custSecretCode;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custSecretCode=" + custSecretCode + "]";
	}

}
