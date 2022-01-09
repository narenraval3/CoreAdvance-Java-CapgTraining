import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		int rem, sum=0;
		int temp = num;
		
		while(num>0)
		{
			rem = num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("The Number is an ArmstrongNumber");
		}
		else
		{
			System.out.println("The Number is Not an ArmstrongNumber");
		}

	}

}
