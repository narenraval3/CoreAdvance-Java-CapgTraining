package com.default_autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainScopeDriverClass {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext scopCont = new ClassPathXmlApplicationContext("Scope-Beans.xml");
		
		System.out.println("---------Scope as a Singleton default scope---------");
		Employee emply = (Employee) scopCont.getBean("employee");
		emply.setEmName("Aryan");
		System.out.println("Scope Employee Name: " +emply.getEmName());
		
		Employee emply1 = (Employee) scopCont.getBean("employee");
		System.out.println("Scope Employee Name1: " +emply1.getEmName());
		System.out.println();
		
		System.out.println("---------Scope as a Prototype---------");
		Address addrsA = (Address) scopCont.getBean("address");
		addrsA.setEmCity("Loss Angeles");
		addrsA.setEmState("California");
		
		Address addrsB = (Address) scopCont.getBean("address");
		System.out.println("Emp Address B City: " +addrsB.getEmCity());
		System.out.println("Emp Address B State: " +addrsB.getEmState());
		
	}

}
