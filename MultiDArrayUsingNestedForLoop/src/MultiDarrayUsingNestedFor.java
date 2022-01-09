import java.util.*;
public class MultiDarrayUsingNestedFor {

	public static void main(String[] args) {
		int x[][] = new int[3][4];
		Scanner scanner = new Scanner(System.in);
		int i, j;
		
		for(i=0; i<=2; i++)
		{
			for(j=0; j<=3; j++)
			{
				System.out.println("Enter your val: ");
				x[i][j] = scanner.nextInt();
			}
		}
		
		for(i=0; i<=2; i++)
		{
			for(j=0; j<=3; j++)
			{
				System.out.println("Your val is: " +x[i][j]);
			}
		}

	}

}
