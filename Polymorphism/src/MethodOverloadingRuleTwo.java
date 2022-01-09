class MethodOverloadingSecond
{
	private int num1;
	private float num2;
	
	public void get(int a)
	{
		num1=a;
	}
	public void get(float b)
	{
		num2=b;
	}
	
	public void show()
	{
		System.out.println("NUM1: " +num1);
		System.out.println("NUM2: " +num2);
	}
}
public class MethodOverloadingRuleTwo {

	public static void main(String[] args) {
		MethodOverloadingSecond mos = new MethodOverloadingSecond();
		mos.get(100);
		mos.get(99.9f);
		mos.show();
	}
}