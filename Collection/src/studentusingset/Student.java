package studentusingset;

import java.util.*;

public class Student {
	
	String name;
	int rollno;
	
	public Student(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	
	public String toStrig()
	{
		return ("Student{ " + "name=" + name + '\''+", rollNo=" + rollno + '}');  
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		
		if(obj == null || getClass() != obj.getClass())
			return false;
		
		Student student = (Student) obj;
		return rollno == student.rollno;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(rollno);
	}
}
