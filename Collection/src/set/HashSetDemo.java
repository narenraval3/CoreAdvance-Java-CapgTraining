package set;
import java.util.*;

public class HashSetDemo { //set will not maintain order

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		hs.add("AA");
		hs.add("BB");
		hs.add("CC");
		
		hs.add(20);  //Not take any duplicate value
		hs.add("BB");
		
		System.out.println("Set: " +hs);
		System.out.println("To Remove: " +hs.remove("BB")); 
		System.out.println("Set: " +hs);
		System.out.println("To check Hash Code: " +hs.hashCode());
	
		System.out.println("To check empty or not: " +hs.isEmpty());
		System.out.println("To check contain element: " +hs.contains(20));
		System.out.println("To check the size: " +hs.size());
		
		hs.clear(); //it will clear the all element of set
		System.out.println("Set: " +hs);
	}

}
