////////Exception Handling using Try Catch block in Single Dimensional Array

public class ExceptionTryCatchInSingleDArray {
	
	public static void main(String[] args) {
		
		try {
			int[] x = new int[2];
			x[0] = 100;
			x[1] = 200;
			
			System.out.println("Val is: " +x[0]);
			System.out.println("Val is: " +x[1]);
			System.out.println("Val is: " +x[2]);
		}
		catch(ArrayIndexOutOfBoundsException arex)
		{
			System.out.println("The Type of Exp is: " +arex.getMessage());
		}
		
		System.out.println("This Array Out Of Boundary Example");
		}
}