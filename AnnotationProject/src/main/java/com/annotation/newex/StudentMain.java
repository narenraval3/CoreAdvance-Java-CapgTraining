package com.annotation.newex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext appStud = new ClassPathXmlApplicationContext("annotation-beans.xml");
		
		Student studA = appStud.getBean("student", Student.class);
		studA.setStudId("17");
		studA.setStudName("Madhu");
		System.out.println("Hash Code of StudA: " +studA.hashCode());
		System.out.println();
		
		Student studB = appStud.getBean("student", Student.class);
		System.out.println("Student B ID: " +studB.getStudId());
		System.out.println("Student B NAME: " +studB.getStudName());
		System.out.println("Hash Code of StudB: " +studB.hashCode());
	}

}
