package ConditionalStatements;

public class IfLoops {

	public static void main(String[] args) {
		
////If Else ---------------------------------------
		int age = 18;
		if(age>=18)
		{
			System.out.println("Elligle to vote");
		}
		else
		{
			System.out.println("Not Elligle to vote");
		}
		System.out.println();
		
////If Else If -----------------------------------
		int marks=65;
		if(marks<40)
		{
			System.out.println("Fail");
		}
		else if(marks>40 && marks<=60)
		{
			System.out.println("First Division");
		}
		else if(marks>60 && marks<=80)
		{
			System.out.println("Distinction");
		}
		else if(marks>80 && marks<=100)
		{
			System.out.println("Super Yaara");
		}
		else
		{
			System.out.println("Absent");
		}
		System.out.println();
		
////Nested If ------------------------------------
		int a=20, b=30;
		if(a<b)
		{
			if(b>a)
			{
				if(a!=b)
				{
					System.out.println("a<b, b>a & a!=b is True");
				}
				System.out.println("a<b, b>a is True");
			}
			System.out.println("a<b is True");
		}
	}
}
