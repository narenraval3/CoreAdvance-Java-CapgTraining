package Exception;

public class MultiTryCatchWithFinally {
	
		public static void main(String[] args) {
			
////////////TryCatch in ArithmeticException---------------	
			try {
				System.out.println("Hi RN!");
				
				int a=10, b=2;
				int c=a/b;	
				System.out.println("C: " +c);
				
				int d=10/0;
				System.out.println("D: " +d);	
			}
			catch(ArithmeticException am)
			{
				System.out.println("The Excp: " +am.getMessage());
			}
			System.out.println();
			
////////////TryCatch in ArrayIndexOutOfBoundsException-------------------------------------
			try {
				int[] sd = {10, 20, 30, 40, 50};
								
				System.out.println("sd[0]: " +sd[0]+ " sd[2]: " +sd[1]);
				System.out.println("sd[3]: " +sd[8]);
			}
			catch(ArrayIndexOutOfBoundsException arr)
			{
				System.out.println("The Excp: " +arr.getMessage());
			}
			System.out.println();
			
////////////TryCatch in NullPointerException-------------------------------------
			try {
				String s = "NAREN";
				String str = null;
				
				System.out.println("String: " +s);
				System.out.println("Length: " +str.length());
			}
			catch(NullPointerException np)
			{
				System.out.println("The Excp: " +np.getMessage());
			}
						
			finally {
				System.out.println("Multiple Try Catch Block");
			}
	}
}
