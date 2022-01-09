package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapMainDriver {

	public static void main(String[] args) {
		
		ApplicationContext setApp = new ClassPathXmlApplicationContext("mapinject-bean.xml");
		
		SetOfBooks setObj = (SetOfBooks) setApp.getBean("setBooks");
		System.out.println("Set Of Book: " +setObj.getBookSet());

	}

}
