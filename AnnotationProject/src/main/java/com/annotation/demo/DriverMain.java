package com.annotation.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		String springConfigFile = "annotation-beans.xml";		
	
		AbstractApplicationContext appCon = new ClassPathXmlApplicationContext(springConfigFile);
		
		Greeter g = appCon.getBean("greeter", Greeter.class);
		System.out.println("Go Greeter " +g);
		g.greet();
		
		AmarilloVisitor av = appCon.getBean("amriloVis", AmarilloVisitor.class);
		av.setName("Naren Raval");
		Greeter greet = appCon.getBean("greeter", Greeter.class);
		greet.setVisitor(av);
		greet.greet();
		
		System.out.println();
		Employee e = appCon.getBean("employee", Employee.class);
		e.setEmpId(39);
		e.setEmpName("Aryan");
		System.out.println("ID: " +e.getEmpId());
		System.out.println("NAME: " +e.getEmpName());
		
		appCon.close();

	}

}
