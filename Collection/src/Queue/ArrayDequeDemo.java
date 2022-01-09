package Queue;
import java.util.*;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		//In ArrayDeque we can insert element from both end
		
		ad.offer(20);
		ad.offer(30);
		ad.offer(50);
		ad.offer(60);
		
		ad.offerFirst(10);
		ad.offerLast(40);
		
		System.out.println("ArrayDeque: " +ad);
		
		System.out.println("To check Top ele: " +ad.peek());
		System.out.println("To check First ele: " +ad.peekFirst());
		System.out.println("To check Last ele: " +ad.peekLast());
		
		System.out.println("To Remove: " +ad.poll());
		System.out.println("ArrayDeque After poll: " +ad);
		
		System.out.println("To Remove First ele: " +ad.pollFirst());
		System.out.println("ArrayDeque After First poll: " +ad);
		
		System.out.println("To Remove Last ele: " +ad.pollLast());
		System.out.println("ArrayDeque After Last poll: " +ad);

	}

}
