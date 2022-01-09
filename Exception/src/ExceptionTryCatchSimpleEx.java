//////////Simple Exception Handling using Try Catch block 

public class ExceptionTryCatchSimpleEx {
	
	public static void main(String[] args) {
		
		System.out.println("Hi! RN");
		System.out.println("How are you?");
		System.out.println();
		
		try {
		System.out.println(7/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("The Type of Exp is: " +ae.getMessage());
			System.out.println("Cause: " +ae.getCause());
		}
		
		System.out.println();
		System.out.println("I am good");
		System.out.println("What about you?");
		System.out.println("This is Arithmetic Exception Example");
	}
}