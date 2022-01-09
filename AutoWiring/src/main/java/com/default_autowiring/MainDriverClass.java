package com.default_autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriverClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext apCon = new ClassPathXmlApplicationContext("defaultautowiring-beans.xml");
		
		Employee emp = (Employee) apCon.getBean("employee");
		
		System.out.println("EMployee Name: " +emp.getEmName());		
		System.out.println("EMployee City: " +emp.getAddress().getEmCity());
		System.out.println("EMployee State: " +emp.getAddress().getEmState());
		System.out.println();
		
		Address adrs2 = (Address) apCon.getBean("address2");
		System.out.println("EMployee2 City: " +adrs2.getEmCity());
		System.out.println("EMployee2 State: " +adrs2.getEmState());
		System.out.println();
		
		Customer cs = (Customer) apCon.getBean("customer");
		System.out.println("Customer ID: " +cs.getCustId());		
		System.out.println("Customer Name: " +cs.getCustName());
		
		apCon.close();
	}

}
