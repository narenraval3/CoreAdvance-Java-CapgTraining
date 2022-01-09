package Exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		try {
			int a=44, b=22;
			int c=a/0;
			System.out.println("C: " +c);
			
			//inside trycatch---------------------
			try {
				int[] x = new int[2];
				x[0] = 100;
				x[1] = 200;
				
				System.out.println("x[3]: " +x[3]);
			}
			catch(ArrayIndexOutOfBoundsException arr) 
			{
				System.out.println("The Inside TryCatch Excp: " +arr.getMessage());
			}	
			finally {
				System.out.println("Finally Block of Inside TryCatch");
				System.out.println();
			}
			////-------------------------------------
		}
		catch(ArithmeticException arm)
		{
			System.out.println("The Outside TryCatch Excp: " +arm.getMessage());
		}
		
		finally {
			System.out.println("Nested Try Catch Block");
		}
	}

}
