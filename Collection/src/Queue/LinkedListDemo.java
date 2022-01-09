package Queue;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Queue ql = new LinkedList();
		//LinkedList<> q = new LinkedList<>();
		//Queue works on FIFO & LILO
		
		ql.offer(10);  //if operation is not performed well then it throw null
		ql.offer(20);
		ql.offer(30);
			//Or,
		ql.add(40); // if operation is not performed well then it will crash
		ql.add(50);
		
		System.out.println("Queue_LinkedList: " +ql);
		System.out.println();
		
		System.out.println("To Remove: " +ql.poll());
					//Or,
		System.out.println("To Remove:" +ql.remove());
		
		System.out.println("Queue_LinkedList: " +ql);
		
		System.out.println();
		System.out.println("To check Top ele: " +ql.peek());
					//Or,
		System.out.println("To check Top ele: " +ql.element());
		
		System.out.println("Queue_LinkedList: " +ql);
	}

}
