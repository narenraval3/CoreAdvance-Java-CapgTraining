
public class multiifelseloop {

	public static void main(String[] args) {
		int marks;
		marks=70;
		if(marks<40)
		{
			System.out.println("Fail");
		}
		else if((marks>40) && (marks<=50))
		{
			System.out.println("3rd Division");
		}
		else if((marks>50) && (marks<=60))
		{
			System.out.println("2nd Division");
		}
		else if((marks>60) && (marks<=70))
		{
			System.out.println("1st Division");
		}
		else if((marks>70) && (marks<=100))
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Result WithHeld/Absent");
		}

	}

}
