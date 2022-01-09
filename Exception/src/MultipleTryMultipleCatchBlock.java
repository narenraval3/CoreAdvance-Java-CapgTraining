
public class MultipleTryMultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int x, y, z;
			x=10;
			y=0;
			z=x/y;
			
			System.out.println("Z is: " +z);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("First Exception: " +ae.getMessage());
		}
		
		try {
			int m[] = {10, 20, 30, 40, 50};
			 System.out.println("Array is: " +m[13]);
		}
		catch(ArrayIndexOutOfBoundsException arx)
		{
			System.out.println("Second Exception: " +arx.getMessage());
		}
		finally
		{
			System.out.println("In Finally block the program that needs to be executed comes here");
		}
		System.out.println("Multiple Try And Multiple Catch Exception Hnadling");
	}
}
