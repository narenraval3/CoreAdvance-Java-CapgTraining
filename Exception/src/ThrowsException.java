//throws keyword is compile time exception except throws all run time exception in java 
import java.io.*;
public class ThrowsException {

	public static void main(String[] args) throws IOException { 
		
		DataInputStream ds = new DataInputStream(System.in);
		
		System.out.println("Enter the Name: ");
		String name = (ds.readLine());
		
		System.out.println("Enter the Usn: ");
		int usn = Integer.parseInt(ds.readLine());
		
		System.out.println("Enter the Marks: ");
		float marks = Float.parseFloat(ds.readLine());
		
		System.out.println();
		
		System.out.println("NAME: " +name+ " USN: " +usn+ " MARKS: " +marks);
	}

}
