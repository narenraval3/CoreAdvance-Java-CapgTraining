class ThreadChild extends Thread
{
	public void run()
	{
		System.out.println("Even Numbers are: ");
		for(int i=2; i<=10; i+=2)
		{
			System.out.println("I= " +i);
		}
	}
}

public class UserDefinedThreadCreationAnotherWay {

	public static void main(String[] args) {
		
		ThreadChild c = new ThreadChild();
		c.start();
		
		ThreadChild c1 = new ThreadChild();
		c1.start();
	}

}
