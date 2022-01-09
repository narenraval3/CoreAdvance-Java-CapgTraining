package Interface;

public interface College 
{	
	void Name();
	void Addrs();
}

class University implements College
{

	@Override
	public void Name() 
	{
		System.out.println("Bangalore Technological Institute");
	}

	@Override
	public void Addrs() 
	{
		System.out.println("BTM Layout");
	}	
}