package set;

import java.util.*;

public class TreeSetDemo { //TreeSet will maintain the sorted order 

	public static void main(String[] args) throws Exception {
		
		TreeSet ts = new TreeSet();
		//Set ts = new TreeSet();
		
		ts.add(10);
		ts.add(20);
		ts.add(40);
		ts.add(30);
		ts.add(35);
		
    	ts.add(20);  //Not take any duplicate value
		
		System.out.println("Set: " +ts);
		System.out.println("To Remove: " +ts.remove(20)); 
		System.out.println("Set: " +ts);
		System.out.println("To check Hash Code: " +ts.hashCode());
	
		System.out.println("To check empty or not: " +ts.isEmpty());
		System.out.println("To check contain element: " +ts.contains(20));
		System.out.println("To check the size: " +ts.size());
		
		ts.clear(); //it will clear the all element of set
		System.out.println("Set: " +ts);
	}

}
