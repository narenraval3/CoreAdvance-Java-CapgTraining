package Interface;

interface Mobile
{
	// by default public abstract <will added by compiler> void MobileBrand();
	void MobileBrand();
	void MobileName();
	void MobileVersion();
	void ReleaseYear();
}

class Iphone implements Mobile
{
	public void MobileBrand()
	{
		System.out.println("Brand Iphone");
	}
	
	public void MobileName()
	{
		System.out.println("Iphone 13");
	}
	
	public void MobileVersion()
	{
		System.out.println("Iphone 13 10th Generation");
	}
	
	public void ReleaseYear()
	{
		System.out.println("2021");
	}
}

class Oneplus implements Mobile
{
	public void MobileBrand()
	{
		System.out.println("Brand ONEPLUS");
	}
	
	public void MobileName()
	{
		System.out.println("Oneplus 9 pro");
	}
	
	public void MobileVersion()
	{
		System.out.println("Oneplus 9 pro 7th Generation");
	}
	
	public void ReleaseYear()
	{
		System.out.println("2020");
	}
}

public class Interface_Mobile {

	public static void main(String[] args) {
		
		Iphone i = new Iphone();
		i.MobileBrand();
		i.MobileName();
		i.MobileVersion();
		i.ReleaseYear();
		
		Oneplus o = new Oneplus();
		o.MobileBrand();
		o.MobileName();
		o.MobileVersion();
		o.ReleaseYear();
	}

}
