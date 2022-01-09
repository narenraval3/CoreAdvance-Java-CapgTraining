class Factorial extends Thread
{
	int fact = 1;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Factorial Program");
			for(int i=5; i>=1; i--)
			{
				fact = i*fact;
			}
			System.out.println("Factorial of 5 is: " +fact);
			this.notify();
		}
	}
}

public class NotifyWaitUsingBlockLevelSynchronization {

	public static void main(String[] args) throws InterruptedException {
		Factorial f = new Factorial();
		f.start();
		
		synchronized(f)
		{
			f.wait();
			System.out.println("Main Method Factorial: " +f.fact);
		}
	}

}
