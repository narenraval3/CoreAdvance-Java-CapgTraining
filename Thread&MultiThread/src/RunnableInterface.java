class RunnableChild implements Runnable
{
	public void run() //Runnable Interface only has run() method
	{
		System.out.println("Even Numbers");
		for(int i=2; i<=10; i+=2)
		{
			System.out.println("i: " +i);
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		RunnableChild rc = new RunnableChild();
		Thread t = new Thread(rc);
		t.start();
	}

}
