
public class FloydPiramidPattern {

	public static void main(String[] args) {
		int row=5;
		int num=1;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

	}

}