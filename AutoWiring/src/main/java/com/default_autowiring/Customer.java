package com.default_autowiring;

public class Customer {
	
	private String custName;
	private String custId;
	
	public Customer(String custName, String custId) {
		this.custName = custName;
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}	

}
