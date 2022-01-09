
public class NumberPiramidPatternInverted {

	public static void main(String[] args) {
		int row=5;
		
		for(int i=row; i>=0; i--)
			//or,
			//for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
				//or,
				//for(int j=1; j<=row-i+1; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
