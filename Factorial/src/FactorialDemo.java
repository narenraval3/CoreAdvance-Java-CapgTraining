
public class FactorialDemo {

	public static void main(String args[]) {
		int i, fact=1;
		int num=5;
		
		//int num;
		//num= Integer.parseInt(args[0]);
		
		for(i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of: " +num+ " is: " +fact);
	}

}
