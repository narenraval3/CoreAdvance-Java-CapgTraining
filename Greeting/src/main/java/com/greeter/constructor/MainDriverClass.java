package com.greeter.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greeter.Customer;
import com.greeter.Greeter;
import com.greeter.JerseyVisitor;

public class MainDriverClass {
	
public static void main(String[] args) {
		
		String springConfigFile = "greeter-beans.xml";
		
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext(springConfigFile);
		
		PaymentGateway gateway = (PaymentGateway) appContext.getBean("paymentGet");
        gateway.processOrder();
        appContext.close();
	}

}
