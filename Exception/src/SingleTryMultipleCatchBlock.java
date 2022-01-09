
public class SingleTryMultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int x, y, z;
			int m[] = {10, 20, 30, 40, 50};
			x=10;
			y=0;
			
			z=x/y;
			System.out.println("Z is: " +z);
			//System.out.println("Array is: " +m[2]);
			
			//z=x/y;
			//System.out.println("Z is: " +z);
			System.out.println("Array is: " +m[7]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("First Exception: " +ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException aex)
		{
			System.out.println("Second Exception: " +aex.getMessage());
		}
		finally
		{
			System.out.println("In Finally block the program that needs to be executed comes here");
		}
		System.out.println("Single try Multiple Catch Exception Handling");
	}

}
