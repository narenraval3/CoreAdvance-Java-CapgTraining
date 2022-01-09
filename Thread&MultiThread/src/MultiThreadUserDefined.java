class ChildThread1 extends Thread
{
	String name;
	int usn;
	
	public ChildThread1()
	{
		super("User defined first child Thread 'ThreadJOY'");
		name = "NAREN";
		usn = 39;
		start();
	}
	public void run()
	{
		System.out.println("NAME: " +name);
		System.out.println("USN: " +usn);
		System.out.println("NAME: " +name+ " USN: " +usn);
		System.out.println("User Defined Thread: " +Thread.currentThread().getName());
		System.out.println();
	}
}

class ChildThread2 extends Thread
{
	float marks;
	String branch;
	
	public ChildThread2()
	{
		super("User defined second child Thread 'ThreadKING'");
		marks = 99.9f;
		branch = "Computer";
		start();
	}
	public void run()
	{
		System.out.println("MARKS: " +marks);
		System.out.println("BRANCH: " +branch);
		System.out.println("MARKS: " +marks+ " BRANCH: " +branch);
		System.out.println("User Defined Thread: " +Thread.currentThread().getName());
	}
}

public class MultiThreadUserDefined {

	public static void main(String[] args) {
		ChildThread1 c1 = new ChildThread1();
		ChildThread2 c2 = new ChildThread2();
		
		System.out.println("Current Thread: " +Thread.currentThread().getName());
	}

}
