package com.mapinject.film;

import java.util.List;
import java.util.Map;

public class FilmDirectors {
	
	private Map<Integer, String> directorMap;
	private List<String> directorList;
	private String message;
	
	public Map<Integer, String> getDirectorMap() {
		return directorMap;
	}
	public void setDirectorMap(Map<Integer, String> directorMap) {
		this.directorMap = directorMap;
	}
	
	public List<String> getDirectorList() {
		return directorList;
	}
	public void setDirectorList(List<String> directorList) {
		this.directorList = directorList;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	//Methods---------------------
	public void printDirectorsMap()
	{
		System.out.println("The Directors Map: " +this.directorMap);
	}
	
	public void printDirectorsList()
	{
		System.out.println("The Directors List: " +this.directorList);
	}
}
