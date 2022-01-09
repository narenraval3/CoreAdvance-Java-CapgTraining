package List;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		//List<> ll = new LinkedList<>();
		//All methods of ArrayList work in LinkedList
		
		ll.add(10);
		ll.add(20);
		ll.add(55.55);
		
		ll.add("rn");
		ll.add("raval");
		
		ll.add(true);
		ll.add(false);
		
		ll.add(40); //duplication also allowed
		ll.add(55.55);
		
		System.out.println("LinkedList: " +ll);
		System.out.println();
		
		System.out.println("To Retrive Individual any val: " +ll.get(2)); //any value can be retrive
		System.out.println("To Remove any val: " +ll.remove(4));
		
		//To add & remove in 1st & last position for Linked list
		ll.addFirst(0);
		ll.addLast("End");
		System.out.println("LinkedList: " +ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("LinkedList: " +ll);
		System.out.println();
		
		System.out.println("To check LinkedList is emtpy or not: " +ll.isEmpty());
		System.out.println("To check LinkedList contain any val: " +ll.contains("rn"));
		System.out.println("To check LinkedList contain any val: " +ll.contains("raval"));
		
		System.out.println("To check the size of LinkedList: " +ll.size());
		System.out.println();
		
		//To insert any value in any position
		ll.add(0, "Hey");
		System.out.println("LinkedList: " +ll);
		
		//To set any value in place any index val i.e. to replace
		ll.set(1, "Hi");
		System.out.println("LinkedList: " +ll);
		System.out.println("To clone the LinkedList: " +ll.clone());
		
		//to iterate the list
		System.out.println("Using For_Loop Iterator: ");
		for(int i=0; i<ll.size(); i++)
		{
			System.out.println("LinkedList element: " +ll.get(i));
		}
			
		System.out.println("Using For_Each Iterator:");
//		for(<String, Integer, Float, Boolean>element: ll)
//		{
//					
//		}
				
		System.out.println("Using Iterator: ");
		Iterator it = ll.iterator();
		{
			while(it.hasNext())
			{
				System.out.println("LinkedList element: " +it.next());
			}
		}
	}

}
