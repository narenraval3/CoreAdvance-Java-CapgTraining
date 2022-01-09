package List;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		//Stack<datatype> s = new Stack<>();
		//Stack works on FILO & LIFO
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push("AA");
		s.push("BB");
		s.push("CC");
		
		System.out.println("Stack: " +s);
		System.out.println("To check top ele: " +s.peek());
		System.out.println("Poped element: " +s.pop());
		System.out.println("Poped element: " +s.pop());
		System.out.println("Stack After POP: " +s);
	}
}