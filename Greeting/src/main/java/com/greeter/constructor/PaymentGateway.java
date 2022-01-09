package com.greeter.constructor;

public class PaymentGateway {
	
	private Order order;

	public PaymentGateway(Order order) {
		this.order = order;
	}
	
	public void processOrder()
	{
		System.out.println("Process Order:- " +order.getItem());
	}
}
