import java.util.*;
public class PrimaidPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of Rows: ");
		int row=sc.nextInt();
		
		for(int i=1; i<=row; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
