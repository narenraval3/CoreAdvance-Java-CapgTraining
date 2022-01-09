package Thread;
import java.util.*;

class ChildThead extends Thread
{
	public void run()
	{
		System.out.println("Program for Printing the Even Numbers: ");
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the Number Range: ");
			int range = sc.nextInt();
			
			for(int i=0; i<=range; i+=2)
			{
				System.out.println("Even: " +i);
			}
		}	
	}
}

public class ByExtendingThread {

	public static void main(String[] args) {
		
		ChildThead ct = new ChildThead();
		ct.start();
	}

}
