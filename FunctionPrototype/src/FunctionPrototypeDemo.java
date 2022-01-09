class FunctionPrototype
{
	private int num1,num2;
	private String name;
	
	public void get(int a, int b, String c)
	{
		num1=a;
		num2=b;
		name=c;
	}
	public void disp()
	{
		System.out.println("Num1 val is: " +num1);
		System.out.println("Num2 val is: " +num2);
		System.out.println("Name: " +name);
	}
}
public class FunctionPrototypeDemo {

	public static void main(String[] args) {
		FunctionPrototype fp = new FunctionPrototype();
		FunctionPrototype fpp = new FunctionPrototype();
		fp.get(11111, 22222, "NaReN");
		fp.disp();
		
		fpp.get(33333, 44444, "RaVal");
		fpp.disp();
	}

}
