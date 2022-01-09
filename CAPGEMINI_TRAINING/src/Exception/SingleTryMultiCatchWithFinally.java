package Exception;

public class SingleTryMultiCatchWithFinally {

	public static void main(String[] args) {
		
		try {
			int x=55, y=0;
			int[] m = {90, 80, 70, 60}; 
			String st = null;
			
			int z = x/y;
			
			System.out.println("Z: " +z);
			
			System.out.println("M[]: " +m[5]);
			
			System.out.println("String: " +st.length());
		}
		
		catch(ArithmeticException am)
		{
			System.out.println("The Excp: " +am.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println("The Excp: " +arr.getMessage());
		}
		
		catch(NullPointerException np)
		{
			System.out.println("The Excp: " +np.getMessage());
		}
					
		finally {
			System.out.println("Single Try Multi Catch Block");
		}
	}

}
