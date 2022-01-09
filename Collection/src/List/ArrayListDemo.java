package List;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//List arl = new ArrayList();
		//List<datatype> arl = new ArrayList<datatype>(); //for generalize
		
		ArrayList arl = new ArrayList();
		
		arl.add(10);
		arl.add(20);
		arl.add(55.55);
		
		arl.add("rn");
		arl.add("rvl");
		
		arl.add(true);
		arl.add(false);
		
		arl.add(10); //duplication also allowed
		arl.add(20);
		
		System.out.println("ArrayList: " +arl);
		System.out.println();
		
		System.out.println("To Retrive Individual val: " +arl.get(2)); //any value can be retrive
		System.out.println("To Remove any val: " +arl.remove(4));
		System.out.println("ArrayList: " +arl);
		System.out.println();
		
		ArrayList<Integer> newarl = new ArrayList<>();
		newarl.add(60);
		newarl.add(70);
		
		arl.add(newarl); //to add whole Arrylist  
		System.out.println("ArrayList: " +arl);
		
		System.out.println();
		System.out.println("To check Arrylist is emtpy or not: " +arl.isEmpty());
		System.out.println("To check Arraylist contain any val: " +arl.contains(55.55));
		System.out.println("To check Arraylist contain any val: " +arl.contains("rvl"));
		
		System.out.println("To check the size of Arraylist: " +arl.size());
		System.out.println();
		
		//To insert any value in any position
		arl.add(0, "Hey");
		System.out.println("ArrayList: " +arl);
		
		//To set any value in place any index val i.e. to replace
		arl.set(1, "Hi");
		System.out.println("ArrayList: " +arl);
		System.out.println("To clone the Arraylist: " +arl.clone());
		System.out.println();
				
		//to iterate the list
		System.out.println("Using For_Loop Iterator: ");
		for(int i=0; i<arl.size(); i++)
		{
			System.out.println("ArrayList element: " +arl.get(i));
		}
		
		System.out.println("Using For_Each Iterator:");
//		for(<String, Integer, Float, Boolean>element: arl)
//		{
//			
//		}
		
		System.out.println("Using Iterator: ");
		Iterator it = arl.iterator();
		{
			while(it.hasNext())
			{
				System.out.println("ArrayList element: " +it.next());
			}
		}
	}

}
