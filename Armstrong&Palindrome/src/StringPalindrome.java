import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str, rev="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		str = sc.nextLine();
		
		for(int i = str.length()-1; i >= 0; i--)
			//Or,
			//int len = str.length();
			//for(int i = len-1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is Not Palindrome");
		}
	}
}
