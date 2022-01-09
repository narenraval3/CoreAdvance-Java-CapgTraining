//Java program to find the lenght of a string without using library functions
//Java program to find no of characters in a string without using length().

package String;
import java.util.*;

public class LengthOfString { 

	public static void main(String[] args) {

////////Length of String without Using length library fun		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		
		int i=0;
		for(char c: str.toCharArray())
		{
			i++;
		}
		System.out.println("The Length of String is: " +i);

	
///////Length of String Using length library fun
//		for(int j=0; j<=str.length(); j++)
//		{
//			System.out.println("The Length of String is: " +j);
//		}
		
	}
}
