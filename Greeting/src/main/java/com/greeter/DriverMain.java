package com.greeter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		//Core Java Way
		try {
			FileReader reader = new FileReader("src/main/resources/application.properties");
			Properties properties = new Properties();
			properties.load(reader);
			
			System.out.println("City Name: " +properties.getProperty("city"));
			System.out.println("Street Name: " +properties.getProperty("street"));
		} 
		catch (FileNotFoundException fe) {
			// TODO Auto-generated catch block
			fe.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		String springConfigFile = "greeter-beans.xml";
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(springConfigFile);
		
		Greeter g = appContext.getBean("greeter", Greeter.class);
		g.greet();
		
		Customer cu = appContext.getBean("customer", Customer.class);
		System.out.println("Customer Name:----- " +cu.getCustName());
		System.out.println("Customer Greeting:- " + cu.getGreeting());
		
		System.out.println();
		
		JerseyVisitor jv = appContext.getBean("jerseyvis", JerseyVisitor.class);		
		System.out.println("Jersey Visitor Name:-- " +jv.getName());
		System.out.println("Jersey Visitor Greeting:-- " +jv.getGreeting());
		System.out.println();
		
		AppProperties appPro = (AppProperties) appContext.getBean("appProperty");
		System.out.println("App Properties are: " +appPro.getProperty());
		
		appContext.close();
	}

}
