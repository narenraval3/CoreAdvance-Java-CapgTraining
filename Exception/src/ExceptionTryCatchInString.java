////////Exception Handling using Try Catch block in String

public class ExceptionTryCatchInString {
	
	public static void main(String[] args) {
		
		try {
			String s = null;
			System.out.println(s.length());
			}
			catch(NullPointerException npe)
			{
			System.out.println("The Type of Exp is: " +npe.getMessage());
			}

			System.out.println("Exception Handling in String Example");
			}
	}