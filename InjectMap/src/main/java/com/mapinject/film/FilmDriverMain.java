package com.mapinject.film;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FilmDriverMain {

	public static void main(String[] args) {
		
		String springConfig = "mapinject-bean.xml";
		
		ConfigurableApplicationContext  cat = new ClassPathXmlApplicationContext(springConfig);
		
		FilmDirectors fDir = (FilmDirectors) cat.getBean("filmDirs");
		fDir.printDirectorsMap();
		System.out.println();
		fDir.printDirectorsList();
	}

}