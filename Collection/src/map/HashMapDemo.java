package map;
import java.util.*;
public class HashMapDemo {
    //Map will not maintain insertion order but will maintain key value pair
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put(1, 1000);
		hm.put(4, "Naren");
		
		hm.put(2, 2000);
		hm.put(5, "Hanok");
		
		hm.put(3, 3000);
		hm.put(6, "Nabin");
		
		hm.put("Seven", 777);
				
		System.out.println("Map is: " +hm);
		
		System.out.println("To ckeck contains key or not: " +hm.containsKey(4));
		System.out.println("To ckeck contains value or not: " +hm.containsValue("Naren"));
		
		System.out.println("To Access Individual value by key: " +hm.get(4));
		System.out.println("To remove the data by key: " +hm.remove(6));
		System.out.println("To remove the data by key & value: " +hm.remove(1, 1000));
		
		System.out.println("Map is: " +hm);
	}

}
