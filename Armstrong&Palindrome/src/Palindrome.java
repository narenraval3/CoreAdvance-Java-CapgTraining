import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		//int num=566;
		int rem, sum=0;
		int temp=num;
		
		while(num>0)
		{
			rem = num%10;
			sum = (sum*10) + rem;
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("The Number is Palindrome");
		}
		else
		{
			System.out.println("The Number is Not a Palindrome");
		}
	}

}
