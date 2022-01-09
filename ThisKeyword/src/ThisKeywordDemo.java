class ThisKeyword
{
	private int num1, num2;
	
	public void get(int num1, int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void disp()
	{
		System.out.println("ThisKeyword Num1 val is: " +num1);
		System.out.println("ThisKeyword Num2 val is: " +num2);
	}
}
public class ThisKeywordDemo {

	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		ThisKeyword tkk = new ThisKeyword();
		tk.get(1221, 2112);
		tk.disp();
		
		tkk.get(3443, 5445);
		tkk.disp();
	}
}