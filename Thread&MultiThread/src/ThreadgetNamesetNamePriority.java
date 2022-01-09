
public class ThreadgetNamesetNamePriority {

	public static void main(String[] args) {
		//to know the current thread name
		System.out.println("Default Thread is: " +Thread.currentThread().getName());
		
		Thread.currentThread().setName("ThreadNAREN");
		System.out.println("Current New Thread Name is: " +Thread.currentThread().getName());
		
		System.out.println("Thread Id is: " +Thread.currentThread().getId());
		
		System.out.println("Current Priority: " +Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(2);
		System.out.println("New Priority: " +Thread.currentThread().getPriority());
	}

}
