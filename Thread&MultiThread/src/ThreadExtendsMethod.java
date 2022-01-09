class Child extends Thread
{
	public void run()
	{
		System.out.println("Accending Order NUmber: ");
		for(int i=1; i<=10; i++)
		{
			try
			{
				System.out.println("i: " +i);
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				//write sop or left blank
				//System.out.println("Exception: " +ie.getMessage());
			}
		}
	}
}

public class ThreadExtendsMethod { 

	public static void main(String[] args) throws InterruptedException
	{
		Child c = new Child();
		c.start();
		
		System.out.println(c.isAlive());
		c.join();
		System.out.println(c.isAlive());
		
		System.out.println();
		System.out.println("Decending Order Number: ");
		for(int j=10; j>=1; j--)
		{
			System.out.println("j: " +j);
			Thread.sleep(500);
		}
	}
}
