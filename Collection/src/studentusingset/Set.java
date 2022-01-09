package studentusingset;
import java.util.*;

public class Set {

	public static void main(String[] args) {
		
		HashSet<Student> stuSet = new HashSet<>(); 
		
		System.out.println("The Students are: ");
		
		stuSet.add(new Student("Arun", 2));
		stuSet.add(new Student("Barun", 4));
		stuSet.add(new Student("Carun", 3));
		stuSet.add(new Student("Darun", 2));
		
		Student s1 = new Student("Carun", 3);
		Student s2 = new Student("Harun", 3);
		
		System.out.println(s1.equals(s2));
		
		System.out.println("Student: " +stuSet);

	}

}
