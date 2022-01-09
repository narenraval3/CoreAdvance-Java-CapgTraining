package Fahrenheit_Celsius;

import java.util.*;

public class Source1 {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		int num = ss.nextInt();
		
		switch(num)
		{
			case 1:
			{
				int far = ss.nextInt();
				Utility.farhenheitToCelcius(far);
				System.out.println(Utility.farhenheitToCelcius(far));
			}
			break;
			
			case 2:
			{
				int y = ss.nextInt();
				int [] arr = new int[y];
				
				for(int i=0; i<y; i++) {
					arr[i] = ss.nextInt();
				}
				Utility.getLevel(arr);
				System.out.println(Utility.getLevel(arr));
			}
			break;
			
			default:
			{
				System.out.println("INVALID OPTION");
			}
			break;
		}
	}
}

class Utility
{
	static int farhenheitToCelcius(int far)
	{
		int celci = ((int)((far-32)*5)/9);
		return celci;		
	}
	
	static String getLevel(int[] arr)
	{
		int sum=0;
		int x = arr.length;
		
		for(int i=0; i<x; i++)
		{
			sum = sum+arr[i];
		}
		
		String str = "";
		if(sum>=100)
		{
			str = "HEIGH";
		}
		else if(sum>=70)
		{
			str = "MEDIUM";
		}
		else //else if(sum<70)
		{
			str = "LOW";
		}
		return str;
	}
}

//--------------------------------------------
//import java.util.*;
//
//public class Source {
//	
//	public static void Utility()
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		int sum = 0;
//		
//		switch(num)
//		{
//			//if(num==1)
//			case 1:
//			{
//				double fahrenheit = sc.nextDouble();
//				System.out.println((int)((fahrenheit-32)*5)/9);
//			}
//			break;
//			
//			//else if(num==2)
//			case 2:
//			{
//				int x = sc.nextInt();
//				int[] arr = new int[x];
//				
//				for(int i=0; i<x; i++)
//				{
//					arr[i] = sc.nextInt();
//					sum = sum+arr[i];
//				}
//				
//				if(sum>=100)
//				{
//					System.out.println("HIGH");
//				}
//				else if(sum>=70)
//				{
//					System.out.println("MEDIUM");
//				}
//				else 
//				{
//					System.out.println("LOW");
//				}
//			}
//			break;
//			
//			default:
//			{
//				System.out.println("INVALID OPTION");
//			}
//			break;
//		}
//		
//	}
//	public static void main(String[] args)
//	{
//		//Source s = new Source();
//		Source.Utility();
//	}
//}
