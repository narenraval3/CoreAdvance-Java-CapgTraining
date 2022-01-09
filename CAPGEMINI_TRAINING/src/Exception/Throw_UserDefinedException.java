package Exception;
import java.util.*;

class VotingAgeProblem extends Exception
{
	public VotingAgeProblem(String msg) //if wanna pass the message in code
	{
		super(msg);
	}
	
	public VotingAgeProblem() //if wanna pass the message directly here
	{
		super("Your Age is a Problem");
	}	
}


public class Throw_UserDefinedException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		try {
			if(age>18)
			{
				System.out.println("Your Elligible to Vote");
			}
			else
			{
				throw new VotingAgeProblem("You are not Elligible to Vote");
				//throw new VotingAgeProblem();
			}
		}
		catch(VotingAgeProblem vp)
		{
			System.out.println("The VotingAgeProblem Excp: " +vp.getMessage());
		}
		
		finally{
			System.out.println("User Defined Exception Using Throw");
		}
	}
}
