package Thread;
import java.util.*;

class RunnableChild implements Runnable
{
	public void run()
	{
		System.out.println("Program to print the Multiple of 3: ");
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Number Range: ");
			int num = sc.nextInt();
			
			for(int i=0; i<=num; i+=3)
			{ 
				System.out.println(i);
			}
		}
	}
}

public class ByImplementingRunnable {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Thread Name is: " +Thread.currentThread().getName());
		
		RunnableChild rc = new RunnableChild();
		Thread tt = new Thread(rc);
		
		System.out.println(tt.isAlive()); //false
		tt.start();
		System.out.println(tt.isAlive()); //true
		
		//tt.join();
		
		//OR,
		Thread tt1 = new Thread(new RunnableChild());
		tt1.start();
		System.out.println(tt1.isAlive()); //true
	}

}
