package Fahrenheit_Celsius;
import java.util.*;
import java.io.*;

class Utility1
{
	public static int fahrenheitToCelcius(double fah)
	{
		double cel = (((fah-32)*5)/9);; 
		int celi = (int)Math.round(cel);
		return celi;
	}
	
	public static String getLevel(int[] arr)
	{
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum+arr[i];
		}
		if(sum>=100)
		{
			return "HIGH";
		}
		else if(sum>=70)
		{
			return "MEDIUM";
		}
		else
		{
			return "LOW";
		}
	}
}

public class Source {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num==1)
		{
			int opt = 1;
			double fah = sc.nextDouble();
			System.out.println(Utility1.fahrenheitToCelcius(fah));
		}
		else if(num==2)
		{
			int opt = 2;
			int l = sc.nextInt();
			int arr[] = new int[l];
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();				
			}
			System.out.println(Utility1.getLevel(arr));
		}
		else {
			System.out.println("INVALID OPTION");
		}
	}
}