//To find the Armstrong Number

import java.util.*;
class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		//int num=153;
		int temp=num;
		int rem, sum=0;
		
		while(num>0)
		{
			rem = num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("It is an ArmstrongNumber");
		}
		else
		{
			System.out.println("Not an ArmstrongNumber");
		}
	}

}
