package ObjectClassMethod;

public class EqualsAndtoString {
	
	int value;
	String name;
	String cast;
	
	public void Method()
	{
		System.out.println("This is Equals And toString Method");
		System.out.println();
	}
	
	public boolean equals(Object obj)
	{
		EqualsAndtoString et = (EqualsAndtoString) obj;
		return this.value == et.value;
	}
	
	public String toString()
	{
		//return "[Value: "+value+" ]";
		return value+" "+name+" "+cast;
	}

	public static void main(String[] args) {
		
		EqualsAndtoString et = new EqualsAndtoString();
		et.value = 10;
		et.name = "aryan";
		et.cast = "mfghj";
		
		EqualsAndtoString et1 = new EqualsAndtoString();
		et1.value = 20;
		et1.name = "sam";
		et1.cast = "cvhgfc";
		
		EqualsAndtoString et2 = new EqualsAndtoString();
		et2.value = 10;
		et2.name = "ram";
		et2.cast = "sudeep";
		
		et.Method();
		
		System.out.println(et);
		System.out.println(et1);
		System.out.println(et2);
		
		System.out.println();
		
		System.out.println(et==et1);
		System.out.println(et1==et1);
		System.out.println(et2==et);
		
		System.out.println();
		
		System.out.println(et1.equals(et2));
		System.out.println(et1.equals(et2));
		System.out.println(et2.equals(et2));
	}

}
