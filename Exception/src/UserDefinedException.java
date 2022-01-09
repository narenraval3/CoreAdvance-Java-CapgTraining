class VotingAgeProblem extends Exception
{
	VotingAgeProblem()
	{
		super("Your Age is a Problem");
	}
	
	public VotingAgeProblem(String s)
	{
		super(s);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		
		try {
			int age=18;
			if(age>18)
			{
				System.out.println("You are Elligible to vote");
			}
			else 
			{
				throw new VotingAgeProblem();
				//throw new VotingAgeProblem("You are Not Elligible to vote");
			}
		}
		catch(VotingAgeProblem va)
		{
			System.out.println("The User defined Exception is: " +va.getMessage());
		}
		System.out.println("This is the User Defined Exception Example");
	}

}
