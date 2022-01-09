package Prime_Large;
import java.util.*;

public class Source {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext())
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			int mpr=0, npr=0, mpr1=0, npr1=0, L=0, S=0, flagm=1, flagn=1;
			
			if(m==n)
			{
				System.out.println(0);
			}
			else {
				for(int i=2; i<=n/2; i++)
				{
					npr = npr1%i;
					if(npr==0)
					{
						flagn=0;
						break;
					}
				}
				for(int j=2; j<=m/2; j++)
				{
					mpr = mpr1%j;
					if(mpr==0)
					{
						flagn=0;
						break;
					}
				}
				if(flagm==0 || flagn==0)
				{
					if(m<n) 
					{
						S=m;
					}
					else {
						S=n;
					}
					System.out.println(S);
				}
				else {
					if(m>n)
					{
						L=m;
					}
					else {
						L=n;
					}
					System.out.println(L);
				}
			}
		}
	}
}
