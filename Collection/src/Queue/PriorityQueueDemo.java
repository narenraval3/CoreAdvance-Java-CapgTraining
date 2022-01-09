package Queue;
import java.util.*;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) throws Exception {
		
		//for min heap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//for max heap
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
				
		
		pq.offer(50);
		pq.offer(20);
		pq.offer(10);
		pq.offer(40);
		pq.offer(30);
		
		System.out.println("PriorityQueue: " +pq);
		
		System.out.println("To Remove: " +pq.poll()); //highest Integer value will remove
		System.out.println("PriorityQueue: " +pq);
		
		System.out.println("To check Top ele: " +pq.peek());
	}

}
