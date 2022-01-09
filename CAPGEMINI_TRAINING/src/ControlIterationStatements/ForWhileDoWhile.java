package ControlIterationStatements;

public class ForWhileDoWhile {

	public static void main(String[] args) {
		
//For loop-----------------------------------------------
		System.out.println("For Loop");
		for(int i=1; i<=10; i+=2)
		{
			System.out.println(i);
		}
		
		System.out.println("For Loop decrements");
		for(int i=10; i>=1; i-=3)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
//While loop------------------------------------------
		System.out.println("While Loop");
		int j=10;
		while(j<=20)
		{
			System.out.println(j);
			j+=2;
		}
		
		System.out.println("While Loop decrements");
		int j1=30;
		while(j1>=20)
		{
			System.out.println(j1);
			j1-=3;
		}
		
		System.out.println();
		
//Do While Loop ---------------------------------------
		System.out.println("Do While Loop");
		int k=0;
		do {
			System.out.println(k);
			k+=5;
		}while(k<=50);
		
		System.out.println("Do While Loop decrements");
		int k1=50;
		do {
			System.out.println(k1);
			k1-=5;
		}while(k1>=1);
	}

}
