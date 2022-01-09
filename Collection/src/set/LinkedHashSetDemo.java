package set;
import java.util.*;

public class LinkedHashSetDemo { //it will maintain order

	public static void main(String[] args) throws Exception {
		
		LinkedHashSet lhs = new LinkedHashSet();
		//Set lhs = new LinkedHashSet();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(50);
		lhs.add(30);
		
		lhs.add("AA");
		lhs.add("BB");
		lhs.add("CC");
		
		lhs.add(20);  //Not take any duplicate value
		lhs.add("BB");
		
		System.out.println("Set: " +lhs);
		System.out.println("To Remove: " +lhs.remove("BB")); 
		System.out.println("Set: " +lhs);
		System.out.println("To check Hash Code: " +lhs.hashCode());
	
		System.out.println("To check empty or not: " +lhs.isEmpty());
		System.out.println("To check contain element: " +lhs.contains(20));
		System.out.println("To check the size: " +lhs.size());
		
		lhs.clear(); //it will clear the all element of set
		System.out.println("Set: " +lhs);
	}
}