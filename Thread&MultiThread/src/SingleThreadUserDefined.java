class ChildThread extends Thread
{
	private int num1, num2;
	
	public ChildThread()
	{
		super("User Defines Thread 'ThreadRN'");
		num1 = 100;
		num2 = 200;
		start();
	}
	public void run()
	{
		System.out.println("NUM1: " +num1);
		System.out.println("NUM2: " +num2);
		System.out.println("NUM1: " +num1+ " NUM2: " +num2);
		System.out.println("Current Thread Name: " +Thread.currentThread().getName());
	}	
}

public class SingleThreadUserDefined {

	public static void main(String[] args) {
		ChildThread c = new ChildThread();
		System.out.println("Current/Main Thread is: " +Thread.currentThread().getName());
	}

}
